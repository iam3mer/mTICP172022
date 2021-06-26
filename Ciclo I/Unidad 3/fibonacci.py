# 0, 1, 1, 2, 3, 5, 8, 13, ...

def fibenacci(num:int = 100)->str:
    a, b = 0, 1
    while b < num:
        print(b),
        a, b = b, a + b

#fibonacci(100)

# Obtener la serie de Fibonacci dado un valor inicial y un limite. (Ojo, en la serie de Fibonacci
# no se puede iniciar con numeros diferentes de 0 y 1)
# La serie debe empezar en el valor inicial. (0 y 1)
def fibonacciModificado(limite:int=10)->str: 
    num = 0
    auxLimite = 0
    auxN = num + 1
    while auxLimite <= limite:
        num, auxN = auxN, num + auxN
        print(num)
        auxLimite = auxLimite + 1

fibonacciModificado(100)