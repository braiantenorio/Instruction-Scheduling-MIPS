.data
V:	.word 		4, -1, 7, 2
.text

start:
	li $v0,  4
	la $a0,  msg1
	syscall
    li $v0, 5
    syscall
    add $a0, $v0, $zero

	jal sumatoria 		# invoca al sumatoria

	add $a0, $v0, $zero	# imprime el resultado
    	li  $v0, 1
    	syscall
    
 	addi $v0, $zero, 10 	# salida
    	syscall 		

push: 
	addi $sp, $sp, -4 	# actualiza el pointer
	sw $a0, 0($sp) 		# apila
	jr $ra 		

pull: 
	lw $v0, 0($sp) 	# cargar el dato
	addi $sp, $sp, 4 	# actualiza el puntero
	jr $ra 		

sumatoria: 
	add $t4, $zero, $a0 	
	add $a0, $zero, $ra 	
	jal push 		# apila ra
	add $a0, $zero, $t4 	
	jal recursivasuma 	
	add $t4, $zero, $v0 	
	jal pull 		
	add $ra, $zero, $v0 	
	add $v0, $zero, $t4 

salir:
	jr $ra
recursivasuma:
	addi $t2, $zero, 1
	beq $a0, $t2, finsumatoria
	beq $a0, $zero, finsumatoria
	add $t4, $zero, $a0 		
	add $a0, $zero, $ra 		
	jal push 			
	add $a0, $zero, $t4 		
	jal push 			
	addi $a0, $a0, -1 		# resta para la proxima subrutina
	jal recursivasuma 			
	add $t1, $zero, $v0 		
	jal pull			# desapila
	add $t4, $v0, $t1		# operacion de suma 
	jal pull 			# desapila direccion de retorno
	add $ra, $zero, $v0 		
	add $v0, $zero, $t4 		
	jr $ra 				

finsumatoria: 
	addi $v0, $zero, 1 		# pone en 1 el registro de retorno

recursivasumar_salir: 
	jr $ra 		