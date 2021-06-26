from logica import *

def menu()->None:

    while True:
        print('----- CRUD -----')
        print('----------------')
        print('-1- Agregar Persona')
        print('-2- Mostrar Persona')
        print('-3- Editar Persona')
        print('-4- Eliminar Persona')
        print('-5- Salir')
        opcion = input('Ingrese una opción del menu: ')

        if opcion == '1':
            crear_persona()
        elif opcion == '2':
            imprimir_persona()
        elif opcion == '3':
            actualizar_persona()
        elif opcion == '4':
            eliminar_persona()
        elif opcion == '5':
            break
        else:
            print('La opción no es valida.')

# CREATE
def crear_persona()->dict:

    dictHabilidades = {}
    
    print('Valores para la nueva persona')

    msj = 'Ingrese en numero de identificación de la persona: '
    nuip = comprobarNum(msj)
    nombre = input('Ingrese el nombre de la persona: ')
    ciudad = input('Ingrese la ciudad de residencia: ')
    profesion = input('Ingrese la profesión: ')

    habilidades = []
    #programacion = input('Sabe de programación? [S/s] Sí [N/n] No: ')
    msj = 'Sabe de programación? [S/s] Sí [N/n] No: '
    if comprobacionSN(msj) == True:
        dictHabilidades['programacion'] = True
    else:
        dictHabilidades['programacion'] = False
    
    #bases_de_datos = input('Sabe de bases de datos? [S/s] Sí [N/n] No: ')
    msj = 'Sabe de bases de datos? [S/s] Sí [N/n] No: '
    if comprobacionSN(msj) == True:
        dictHabilidades['bases-de_datos'] = True
    else:
        dictHabilidades['bases-de_datos'] = False
    
    while True:
        #anadirHabilidades = input('Desea añadir una habilidad más? [S/s] Sí [N/n] No: ')
        msj = 'Desea añadir una habilidad más? [S/s] Sí [N/n] No: '
        if comprobacionSN(msj) == True:
            habilidad = input('Ingrese el nombre de la habilidad: ')
            habilidades.append(habilidad)
        else:
            break

    for habilidad in habilidades:
        dictHabilidades[habilidad] = True

    persona = {
        'nombre': nombre,
        'ciudad': ciudad,
        'profesion': profesion,
        'habilidades': dictHabilidades
    }

    # newItem = len(directorio) + 1 # Fue remplazado por nuip
    #directorio[nuip] = persona
    crear(nuip, persona)


# READ
def imprimir_persona(db:dict)->None:
    msj = 'Ingrese el numero de documento de la persona a mostrar: '
    nuip = comprobarNum(msj)
    # Falta validar si la llave principal existe

    persona = imprimir(nuip)

    print(f'La información de {persona["nombre"]} es: ')
    print(f'Ciudad de residencia: {persona["ciudad"]}')
    print(f'Su profesión es: {persona["profesion"]}')
    print(f'Habilidades: {persona["habilidades"]}')


# UPDATE
def actualizar_persona(db:dict)->dict:
    msj = 'Ingrese el numero de documento de la persona a consultar: '
    nuip = comprobarNum(msj)
    # Falta validar si la llave principal existe

    # persona:dict
    # construir el diccionario con la información a actualizar de persona

    msj = 'Quiere actualizar el nombre? [S/s] Sí [N/n] No'
    if comprobacionSN(msj):
        nombre = input('Ingrese el nombre: ')
        db[nuip]['nombre'] = nombre

    msj = 'Quiere actualizar la ciudad? '
    if comprobacionSN(msj):
        ciudad = input('Ingrese la ciudad: ')
        db[nuip].update({'ciudad': ciudad})

    actualizar(nuip, persona)


# DELETE
def eliminar_persona(db:dict)->dict:
    msj = 'Ingrese el numero de documento de la persona a eliminar: '
    nuip = comprobarNum(msj)
    # Falta validar si la llave principal existe

    eliminar(nuip))

    print(f'La iformación de {persona["nombre"]} fue eliminada.')

    return db

menu()