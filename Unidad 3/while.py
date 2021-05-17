def tablas(n:int, m:int)->str:
    return f'{n} * {m} = {n * m}'

'''
t = 2
print(tablas(t, 0))
print(tablas(t, 1))
print(tablas(t, 2))
print(tablas(t, 3))
print(tablas(t, 4))
print(tablas(t, 5))
'''

def tablas2(n:int, m:int)->str:

    aux = 0
    while aux < m:
        print(f'{n} * {aux} = {n * aux}')
        aux = aux + 1

'''
t = 2
tablas2(t, 11)
'''

def tablas3(f:int, i:int = 0, n:int = 1)->str:
    auxN = 1
    
    while auxN <= n:
        print(f'Tabla del {auxN}')
        if i != 0:
            auxM = i
        else:
            auxM = 1
        while auxM < f:
            print(f'{auxN} * {auxM} = {auxN * auxM}')
            auxM = auxM + 1
        auxN = auxN + 1
        print()
    else:
        print("Siempre se va a imprimir esta linea al finalizar el ciclo.")

'''
t = 3
n = 10
tablas3(n, 2, t)
'''

def continueWhile():
    var = 5
    while var > 0:
        var = var - 1
        if var == 3:
            continue # No se imprime el valor para 3, se va al while
        print(f'Estado de var es {var}')

# continueWhile()

'''
a, b = 0, 1
while b < 100:
    print(b),
    a, b = b, a + b
'''

# Obtener la serie de Fibonacci dado un valor inicial y un limite.
# La serie debe empezar en el valor inicial.
def fibonacciModificado(num:int=0, limite:int=10)->str:
    auxLimite = 1
    print(num)
    while auxLimite <= limite:
        num, auxLimite = auxLimite, num + auxLimite
        print(num, auxLimite)
        auxLimite = auxLimite + 1


#fibonacciModificado()



