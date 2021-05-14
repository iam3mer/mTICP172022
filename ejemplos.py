print("Operaciones sobre un cuadrado")

bandera = True

while bandera == True:
    print("1. Area")
    print("2. Perimetro")
    print("3. Salir")

    opcion = input("Ingrese una de las opciones: ")

    if opcion == '1':
        L = int(input("Ingrese el valor del lado: "))
        area = L * L
        print("El area del cuadrado es: ", area)
    elif opcion == '2':
        L = int(input("Ingrese el valor del lado: "))
        perimetro = L + L + L + L
        print("El perimetro del cuadrado es: ", perimetro)
    elif opcion == '3':
        print("A seleccionado salir de la aplicación.")
        bandera = False
    else:
        print("La opción no es valida.")
    #END_IF
#END_WHILE

