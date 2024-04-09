.data
V: .word 4, -1, 7, 2
R: .space 4, -1, 7, 2, 1
.text

start:
	la $t0, V
	la $t1, R
	li $t2, 4
	li $t4, 1
loop:
	beqz $t2, fin_loop
	lw $t3, 0($t0)
	slt $t4, $t3, $zero
	beqz $t4, fin_loop
	addi $t0, $t0, 4
	addi $t2, $t2, -1
	j loop
fin_loop:
	sw $t4, 0($t1)
	addi $v0, $zero, 10
	syscall
