.data

.text
    main:
        lw $1, 0($0)    # Cargar el contenido de la dirección de memoria 0 en el registro $1
        lw $2, 4($0)    # Cargar el contenido de la dirección de memoria 4 en el registro $2
        add $3, $1, $2  # Sumar los contenidos de $1 y $2 y almacenar el resultado en $3
        sw $3, 12($0)   # Almacenar el contenido de $3 en la dirección de memoria 12

        lw $4, 8($0)    # Cargar el contenido de la dirección de memoria 8 en el registro $4
        add $3, $1, $4  # Sumar los contenidos de $1 y $4 y almacenar el resultado en $3
        sw $3, 16($0)   # Almacenar el contenido de $3 en la dirección de memoria 16

        # Agregamos un código de salida para terminar el programa
        li $v0, 10       # Cargar el código de la llamada al sistema para salir del programa
        syscall         # Realizar la llamada al sistema
