.data
V: .word 4, -1
.text

main:
	la $t0, V
	lw $t1, 0($t0)
	lw $t2, 4($t0)
	lw $t4, 8($t0)
	add $t3, $t1, $t2
	sw $t3, 12($t0)
	add $t3, $t1, $t4
	sw $t3, 16($t0)
	li $v0, 10
	syscall
