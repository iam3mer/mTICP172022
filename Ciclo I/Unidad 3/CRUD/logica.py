from datos import directorio

def crear(nuip:int, persona:dict)->dict:
    directorio[nuip] = persona

def imprimir(nuip:int)->dict:
    return directorio[nuip]

def actualizar(nuip:int, persona:dict)->dict:
    directorio[nuip] = persona

def eliminar(nuip:int)->dict:
    return directorio.pop(nuip)

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