# Datatypes -----------------------------------
# # Enteros (int)
# 5
# 425
# -25
print(type(25))

# # Flotantes (float)
# 4.7
# 0.57
# -1.03

print(type(0.52))

# String (str)
print(type('Hola Mundo'))
print(type("Hola Mundo"))
print(type('''Hola Mundo'''))
print(type("""Hola Mundo"""))
print(type('H'))

# Booleanos (bool)
# True -> ...-3, -2, -1, 1, 2, 3...
# False -> 0
print(type(True))
print(type(False))

# Variables --------------------------------------
nombreClave = 'Almacena un dato, estructura' # Camel Case
nombre_clave = 'Almacena un dato, estructura' # Snake Case
NombreClave = 'Almacena un dato, estructura' # Pascal

var1, var2, var3 = 1, 2, 3

print(type(nombreClave))
nombreClave = 10
print(type(nombreClave))
print(nombreClave)

numeroSTR = '20'
print(type(numeroSTR))
numero = int(numeroSTR)
print(type(numero))
numero = float(numeroSTR)
print(type(numero))
print(numero)

print(int(True))
print(int(False))

print(chr(97))
print(ord('a'))

# Colecciones ---------------------------------------------
# Listas (list)
mi_lista = []
mi_lista = [52, 25.45, 'Cadena', 464, 6546, 6746, ['edr', 'dgfg', 'dfhgd']]
print(mi_lista[0])
print(mi_lista[1])
# print(mi_lista[3]) # Error, fuera de indice
print(len(mi_lista))
print(mi_lista[len(mi_lista)-1])
print(mi_lista[6][1])
print(mi_lista[2:6])
print(mi_lista[:-1]) # Omite el ultimo elemento de la coleccion
print(mi_lista[::-1]) # Invierte el orden de los elementos de la coleccion

mi_lista[6][0] = 'TIC'
print(mi_lista)

mi_lista.append('Nueva cadena')
print(mi_lista)
ultimo_en_lista = mi_lista.pop()
print(mi_lista)
print(ultimo_en_lista)

un_elemento_de_la_lista = mi_lista.pop(3)
print(mi_lista)
print(un_elemento_de_la_lista)

print(dir(mi_lista))

vacia = []
print(vacia.__sizeof__())
print(mi_lista)

mi_lista.insert(0, 'Hola')
print(mi_lista)

# Tuplas (tuple)
tupla_vacia = ()
una_tupla =  5, 8, 8, 2
otra_tupla = (5, 8, 8, 2)
print(type(tupla_vacia), type(una_tupla), type(otra_tupla))

print(dir(una_tupla))
print(una_tupla[len(una_tupla)-1])
# una_tupla[0] = 7 # No se puede

print((5, 7, 2) < (5, 6, 4))
print(una_tupla[1:4])

# Conjuntos (set)
un_set = {1,234,345,678674,456,6856,456}
print(un_set)
otro_set = {6546,1,456,5465,6546}
# print(type(un_set))
# print(un_set[3]) # No se puede
# print(dir(un_set))
print(un_set)
print(len(un_set))

union = un_set.union(otro_set)
print(union)
interseccion = otro_set.intersection(un_set)
print(interseccion)
diferencia_1 = otro_set.difference(un_set)
print(diferencia_1)
diferencia_2 = un_set.difference(otro_set)
print(diferencia_2)

# Diccionarios (dict)
# {key: value}
diccionario_vacio = {}
otro_diccionario = {
'Nombre': 'Jhonatan', 
'Apellido': 'Barrera',
'Datos': ['Pereira', 'Risaralda', {'profesion': 'Ingeniero de Sistemas y Computacion',
                                   'Universidad': 'Universidad Tecnológica de Pereira'}]
}

print(otro_diccionario['Datos'][2]['profesion'])

print(dir(otro_diccionario))

ultimo_elemento_del_diccionario = otro_diccionario['Datos'][2].pop('Universidad')
print(ultimo_elemento_del_diccionario)
print(otro_diccionario)
print()
print(list(otro_diccionario.keys()), list(otro_diccionario.values()))

print(list(otro_diccionario.items()))

otro_diccionario['Nueva Llave'] = 52
otro_diccionario['Nueva Llave'] = 'Nuevo valor'
print(otro_diccionario)

otro_diccionario.update(codigo = 'Mat47', nombre = 'Calculo Multivariable')
otro_diccionario.update(nuevoDict = {'codigo': 'Mat47', 'nombre': 'Calculo Multivariable'})
print(otro_diccionario)

# Condicionales ----------------------------------------
if otro_diccionario['Nueva Llave'] == 'Nuevo valor':
    print('Son iguales')
    # instruccion 2
    # instruccion 3
# instruccion 4

if otro_diccionario['Nueva Llave'] == 52:
    print('son iguales')
else:
    print('No son iguales')

numero1 = [5,345,3546,467,567,4576]
numero2 = [10,34,55436,45,56,7567]

if numero1[0] == numero2[0]:
    print('Son igules')
elif numero1[0] < numero2[0]:
    print(f'{numero1[0]} es menor que {numero2[0]}')
else:
    print(f'{numero1[0]} es mayor que {numero2[0]}')

if True:
    print('Esto siempre es verdadero')

if False:
    pass # Nunca entrara en este bloque
else:
    print('Esto siempre es falso')

# Ciclos (for, while)
for item in numero2:
    print(item)

for i in range(len(numero2)):
    if numero1[i] == numero2[i]:
        print('Son igules')
    elif numero1[i] < numero2[i]:
        print(f'{numero1[i]} es menor que {numero2[i]}')
    else:
        print(f'{numero1[i]} es mayor que {numero2[i]}')

for key in otro_diccionario:
    print(otro_diccionario[key])

for k, v in otro_diccionario.items():
    print(k, v)

band = True
contador = 0
while band:
    contador = contador + 1
    print(contador, end=' ')
    if contador == 10:
        break
print()
while band:
    letra = input('Ingrese una letra: ')
    if letra == 'x':
        break

i = 0
while i < len(numero2):

    if numero1[i] == numero2[i]:
        print('Son igules')
    elif numero1[i] < numero2[i]:
        print(f'{numero1[i]} es menor que {numero2[i]}')
    else:
        print(f'{numero1[i]} es mayor que {numero2[i]}')

    i = i + 1
    # i += 1

print('-------------------------------------')
# Funciones ------------------------
def comparar(num1:int, num2:int)->str:
    if num1 == num2:
        return 'Son igules'
    elif num1 < num2:
        return f'{num1} es menor que {num2}'
    else:
        return f'{num1} es mayor que {num2}'

for i in range(len(numero1)):
    print(comparar(numero1[i], numero2[i]))