.data 
V:	.word 		4, -1, 7, 2
R:	.space		1
.text
start:	
	la $t0, V		# cargamos dir de V (&V) en t0
	la $t1, R		# cargamos dir de R (&R) en t1
			
	li $t2, 4		# indico cantidad de elementos de V
	li $t4, 1
loop:	
	beqz $t2, fin_loop 	# finaliza loop cuando t2 == 0
	lw $t3, 0($t0)		# t3 <- V[i]
				
	### verificamos si t3 >= 0
	slt $t4, $t3, $zero	# t4 <- (t3 < 0)
	beqz $t4, fin_loop	# si t4 es falso, sale del loop
				
	addi $t0, $t0, 4	# &V <- &V + 4
	addi $t2, $t2, -1	# --t2
	j loop			# salta a loop
fin_loop:
				
	sw $t4, 0($t1)		# guardamos el resultado en memoria
				
	addi $v0, $zero, 10
	syscall			# fin de programa