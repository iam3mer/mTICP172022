# CRUD (Create, Read, Update, Delete)

directorio = {
    1254587: {
        'nombre': 'Jhonatan',
        'ciudad': 'Pereira',
        'profesion': 'Ingeniero de Sistemas y Computación',
        'habilidades': {
            'programacion': True,
            'bases_de_datos': True,
            'cocina': True,
            'frances': False
        }
    },
    2548754: {
        'nombre': 'Octavio',
        'ciudad': 'Manizales',
        'profesion': 'Ecomista',
        'habilidades': {
            'programacion': False,
            'bases_de_datos': False,
            'cocina': True,
            'frances': True
        }
    }
}


def comprobacionSN(msj:str)->bool:
    while True:
        entra = input(msj)
        if entra == 'S' or entra == 's' or entra == 'Si' or entra == 'si':
            return True
        elif entra == 'N' or entra == 'n' or entra == 'No' or entra == 'no':
            return False
        #else:
        #    continue


def comprobarNum(msj:str)->int:
    while True:
        numero = input(msj)
        if numero.isdigit():
            return int(numero)
            

def menu(opcion:int,db:dict)->None:

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
            db = crear(db)
        elif opcion == '2':
            imprimir(db)
        elif opcion == '3':
            db = actualizar(db)
        elif opcion == '4':
            db = eliminar(db)
        elif opcion == '5':
            break
        else:
            print('La opción no es valida.')

# CREATE
def crear(db:dict)->dict:

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
    directorio[nuip] = persona

    return db


# READ
def imprimir(db:dict)->None:
    msj = 'Ingrese el numero de documento de la persona a mostrar: '
    nuip = comprobarNum(msj)
    # Falta validar si la llave principal existe

    print(f'La información de {db[nuip]["nombre"]} es')
    print(f'Ciudad de residencia: {db[nuip]["ciudad"]}')
    print(f'Su profesión es: {db[nuip]["profesion"]}')
    print(f'Habilidades: {db[nuip]["habilidades"]}')


# UPDATE
def actualizar(db:dict)->dict:
    msj = 'Ingrese el numero de documento de la persona a consultar: '
    nuip = comprobarNum(msj)
    # Falta validar si la llave principal existe

    msj = 'Quiere actualizar el nombre? [S/s] Sí [N/n] No'
    if comprobacionSN(msj):
        nombre = input('Ingrese el nombre: ')
        db[nuip]['nombre'] = nombre

    msj = 'Quiere actualizar la ciudad? '
    if comprobacionSN(msj):
        ciudad = input('Ingrese la ciudad: ')
        db[nuip].update({'ciudad': ciudad})

    return db


# DELETE
def eliminar(db:dict)->dict:
    msj = 'Ingrese el numero de documento de la persona a eliminar: '
    nuip = comprobarNum(msj)
    # Falta validar si la llave principal existe

    persona = db.pop(nuip)

    print(f'La iformación de {persona["nombre"]} fue eliminada.')

    return db


#dbActualizada = crear(directorio)
#dbActualizada = crear(dbActualizada)
#dbActualizada = crear(dbActualizada)
#dbActualizada = crear(dbActualizada)
#print(dbActulizada)

#dbActulizada = actualizar(directorio)
#print(dbActulizada)

#dbActualizada = eliminar(directorio)
#print(dbActualizada)

menu(directorio)