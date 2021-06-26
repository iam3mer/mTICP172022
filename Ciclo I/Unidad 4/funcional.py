# Función Pura
def pure_fun(x, y):
    temp = x + 2 * y
    return temp / (2 * x + y)

# Función impura
lista = []
def impure_fun(arg):
    lista.append(arg)

# Funciones Lambda
# Funciones anonimas, representan una unicá expresión

def dolar(pesos):
    resultado = pesos / 3708
    return resultado

#print(dolar(1000000))

def dolar(pesos):
    return pesos / 3708

def dolar(pesos): return pesos / 3708

lambda pesos: pesos / 3708

conversionDolar = lambda pesos: pesos / 3708

conversionDolar = lambda pesos, dolar: pesos / dolar
#print(conversionDolar(2000000, 3708))

# impar
impar = lambda num: num%2 != 0
#print(impar(2))

# sciling
revertir = lambda cadena: cadena[::-1]
#print(revertir('Hola Tripulantes'))

# Operador MAP
def add_seven(num):
    return num + 7


numeros = [545,5,75,475,145,745,52,74,87,7,45,74,8,45,5,4]
resultado = list(map(add_seven, numeros))
#print(resultado)

resultado = list(map(lambda num: num + 7, numeros))
#print(resultado)

# Operador Filter
resultado = list(map(lambda num: num % 2 != 0, numeros))
#print(resultado)
resultado = list(filter(lambda num: num % 2 != 0, numeros))
#print(resultado)

# Operador Reduce
from functools import reduce

acumulador = 0
for elemento in numeros:
    acumulador += elemento
print(acumulador/len(numeros))

resultado = reduce(lambda x, y: x + y, numeros) / len(numeros)
print(resultado)

# ejemplo

personas = [
    48,
    25
]

personas2 = [
    343,
    34
]

def incrementar(p):
    p += 1
    return p

personas = map(incrementar, personas)

for persona in personas:
    print(persona)

# ZIP zip(secuencia1, secuencia2)
letras = ['a', 'b', 'c', 'd', 'e']
print(letras)
numeros = [1, 2, 3, 4, 5]
resultadoZIP = list(zip(letras, numeros))

print(list(map(lambda x: x[::-1], resultadoZIP)))