# CRUD (Create, Read, Update, Delete)

directorio = {
    1: {
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
    2: {
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

def menu(opcion:int)->None:
    print('----- CRUD -----')
    print('----------------')
    print('-1- Agregar Persona')
    print('-2- Mostrar Persona')
    print('-3- Editar Persona')
    print('-4- Eliminar Persona')
    print('-5- Salir')

def comprobacion(msj:str)->bool:
    while True:
        entra = input(msj)
        if entra == 'S' or entra == 's':
            return True
        elif entra == 'N' or entra == 'n':
            return False
        else:
            continue

# Crear
def crear():

    dictHabilidades = {}

    print()
    print('Valores para la nueva persona')

    nombre = input('Ingrese el nombre de la persona: ')
    ciudad = input('Ingrese la ciudad de residencia: ')
    profesion = input('Ingrese la profesión: ')

    habilidades = []
    #programacion = input('Sabe de programación? [S/s] Sí [N/n] No: ')
    msj = 'Sabe de programación? [S/s] Sí [N/n] No: '
    if comprobacion(msj) == True:
        dictHabilidades['programacion'] = True
    else:
        dictHabilidades['programacion'] = False
    
    #bases_de_datos = input('Sabe de bases de datos? [S/s] Sí [N/n] No: ')
    msj = 'Sabe de bases de datos? [S/s] Sí [N/n] No: '
    if comprobacion(msj) == True:
        dictHabilidades['bases-de_datos'] = True
    else:
        dictHabilidades['bases-de_datos'] = False
    
    while True:
        #anadirHabilidades = input('Desea añadir una habilidad más? [S/s] Sí [N/n] No: ')
        msj = 'Desea añadir una habilidad más? [S/s] Sí [N/n] No: '
        if comprobacion(msj) == True:
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

    newItem = len(directorio) + 1
    directorio[newItem] = persona


def imprimir(db:dict):
    consulta = int(input('A quien deseas consultar: '))

    print(f'La información de {db[consulta]["nombre"]} es')
    print(f'Ciudad de residencia: {db[consulta]["ciudad"]}')
    print(f'Su profesión es: {db[consulta]["profesion"]}')
    print(f'Habilidades: {db[consulta]["habilidades"]}')

imprimir(directorio)