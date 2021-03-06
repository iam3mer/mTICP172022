from pprint import PrettyPrinter
pp = PrettyPrinter(indent=2)

# Estructuras por extensión

numeros = [1,5,3,4,8,2,5,7]
edades = {'Juan': 30, 'Camila': 28}

# Estructuras por compresión

# numeros pares del 2 al 100
numerosPares = []
for num in range(2,101):
    if num % 2 == 0:
        numerosPares.append(num)
#print(numerosPares)

numerosPares = []
for num in range(2,101,2):
    numerosPares.append(num)
#print(numerosPares)

# listaComprension = [definicionElementoAgregar for varible in otraLista]

listaCompresion = [num*2 for num in [2,3,4,5,6,7,8,9,10]]
#print(listaCompresion)

# numeros pares del 2 al 100, por comprension
numerosPares = [num for num in range(2,101) if num % 2 == 0]
#print(numerosPares)

# numeros entre 0 y 100, divisibles por 3
divisible3 = []
for num in range(101):
    #print(f'{num} % 3 = {num % 3}')
    if num % 3 == 0:
        divisible3.append(num)
#print(divisible3)

divisible3 = [num for num in range(101) if num % 3 == 0]
#print(divisible3)

# numeros pares entre 0 y 100, divisibles por 3
paresDivisibles3 = [num for num in range(101) if num % 3 == 0 and num in range(0,101,2)]
#print(paresDivisibles3) 

# Compresion usando funciones
# Numeros pares
def esPar(num:int)->int:
    if num % 2 == 0:
        return num

numerosPares = [num for num in range(0,101) if esPar(num) != None]
#print(numerosPares)

# Area de un cuadrado
ladoCuadrados = [2,4,6,8,10,12,14,16]
areaCuadrados = [l*l for l in ladoCuadrados]
#print(areaCuadrados)

# Construir una funcion que retorne una lista con las llaves de un diccionario (no usar keys)
diccionario = {1:'a', 2:'b', 3:'c'}
#print(list(diccionario.keys()))

keys = []
def myKeys(diccionario:dict)->list:
    for key in diccionario:
        keys.append(key)
    return keys
#print(myKeys(diccionario))

keys = [key for key in diccionario]
#print(keys)

# Construir una funcion que retorne una lista con los valores de un diccionario (no usar values)
diccionario = {1:'a', 2:'b', 3:'c'}
#print(list(diccionario.values()))

values = []
def myValues(diccionario:dict)->list:
    for key in diccionario:
        values.append(diccionario[key])
    return values
#print(myValues(diccionario))

values = [diccionario[key] for key in diccionario]
#print(values)

# Encontrar elementos repetidos en una lista
a = ['Andres', 'Julian', 'Edison', 'Edwin', 'Felipe']
b = ['Francisco', 'Juan', 'Andres', 'Julian', 'Felipe']

repetidos = []
def repetido(a:list,b:list)->list:
    for x in a:
        if x in b:
            repetidos.append(x)
    return repetidos
#print(repetido(a,b))

repetidos = [x for x in a if x in b]
#print(repetidos)

repetidos = []
def repetido(a:list,b:list)->list:
    for x in a:
        for y in b:
            if x == y:
                repetidos.append(x)
    return repetidos
#print(repetido(a,b))

repetidos = [x for x in a for y in b if x == y]
#print(repetidos)

# Tablas de multiplicar
# tablasDict = {2: [4,6,8,10,12,14,16,18], 3: []}
tablasDict = {}
def tablas(num:int)->dict:
    for n in range(2,num+1):
        auxLista = []
        for z in range(2,10):
            auxLista.append(n*z)
        tablasDict[f'Tabla del {n}'] = auxLista
    return tablasDict

#print(tablas(10))

tablasDict = {f'Tabla del {n}': [n*z for z in range(2,10)] for n in range(2,11)}
#print(tablasDict)

# Ejemplo X
listaLLaves = ['1','2','3','4','5','6','7','8']
#diccionario = {1: 1, 2: 8, ...}
diccionario = {int(n) : int(n)**3 for n in listaLLaves}
#print(diccionario)

# {('A', 'B'): 45, ...}
from random import randint, randrange, random, uniform
listaCiudades = ['a','b','c','d','e','f']
# (a,b) (b,a) (a,c) (c,a) (a,d) (d,a) (a,e) (e,a) (a,f) (f,a)
# matrizDistancias = [[(a,b), (a,c)], [(b,a), (b,c)]]
arcos = {i: [(i,j) for j in listaCiudades if j != i] for i in listaCiudades}
#arcos = [(i, j) for i in listaCiudades for j in listaCiudades if i != j]
auxArcos = []
#print(list(arcos.symmetric_difference(arcos)))

arcos = list(arcos.values())
#pp.pprint(arcos)
#print('\n')

def auxArcos():
    auxArcos = []
    i = 0
    for fila in arcos:
        aux = fila[i:len(fila)]
        if aux != []:
            auxArcos.append(aux)
        i += 1
    return auxArcos

arcos = auxArcos()

auxArcos = []
for i in arcos:
    for j in i:
        auxArcos.append(j)
#print(auxArcos)
#print(auxArcos[0][::-1])

numDistancias = len(auxArcos)
Distancias = []
for i in range(numDistancias):
    Distancias.append(randrange(30,1000,30))

#print(Distancias)

# [(a,b), 23, (a,c), 45]
arcosDistancias = {}
for arco in auxArcos:
    dis = Distancias[auxArcos.index(arco)]
    arcosDistancias[arco] = dis
    arcosDistancias[arco[::-1]] = dis
print(arcosDistancias)

