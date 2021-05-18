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