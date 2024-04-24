.data
V:	.word 		4, -1
.text
main:
    la $t0, V		# cargamos dir de V (&V) en t0

    lw $t1, 0($t0)    # Cargar el contenido de la direcci�n de memoria 0 en el registro $1
    lw $t2, 4($t0)   # Cargar el contenido de la direcci�n de memoria 4 en el registro $2
    add $t3, $t1, $t2  # Sumar los contenidos de $1 y $2 y almacenar el resultado en $3
    sw $t3, 12($t0)   # Almacenar el contenido de $3 en la direcci�n de memoria 12

    lw $t4, 8($t0)    # Cargar el contenido de la direcci�n de memoria 8 en el registro $4
    add $t3, $t1, $t4  # Sumar los contenidos de $1 y $4 y almacenar el resultado en $3
    sw $t3, 16($t0)   # Almacenar el contenido de $3 en la direcci�n de memoria 16

    li $v0, 10       # Cargar el c�digo de la llamada al sistema para salir del programa
    syscall         # Realizar la llamada al sistema
