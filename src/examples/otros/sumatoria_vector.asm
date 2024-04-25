	.data 
V:	.word 8,2,1,12,7,-2 
N:	.word 6
R:	.space 4 # la suma debe dar 28

	.text 
main:	
	la $t9, N	# t9 <- dir de N
	la $t8, R	# t8 <- dir de R
	
	# ejecutamos la rutina sum
	lw $a1, 0($t9)	# pasamos por parametro el valor de N
	la $a2, V	# pasamos por parametro la dir de V
	jal sum
	
	sw $v0, 0($t8)	# guardamos el resultado en memoria
	
	addi, $v0, $zero, 10
	syscall 	# terminamos el programa
	
# v0: sumatoria parcial
# a1: longitud de V
# a2: dirV 
sum:
	beqz $a1, caso_base	# si longitud de V es 0, entonces caso base
caso_rec:
	lw $t0, 0($a2)		# $t0 <- V[0]
	
	# apilamos
	sw $t0, 0($sp)		# apilamos elemento actual
	sw $ra, 4($sp)		# apilamos dir de retorno
	addi $sp, $sp, 8
	
	addi $a2, $a2, 4		# &V + 4
	addi $a1, $a1, -1	# --a1
	jal sum
	
	# desapilamos
	addi $sp, $sp, -4	# desapilamos dir de retorno
	lw $ra, 0($sp)
	addi $sp, $sp, -4	# desapilamos elemento actual
	lw $t0, 0($sp)
	
	add $v0, $v0, $t0	# sumatoria parcial <- t0 + sumatoria parcial
	jr $ra			# return sumatoria parcial
caso_base:
	addi $v0, $zero, 0	# return 0
	jr $ra