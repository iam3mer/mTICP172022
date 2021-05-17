# Mostrar en pantalla los numeros primos entre 1 y 100

def primos(limite: int):
    contador = 2
    aux = 1
    primo = 0
    while contador <= limite:
        while aux <= contador:
            if contador % aux == 0:
                primo = primo + 1
            aux = aux + 1
        if primo == 2:
            print(contador)
        contador = contador + 1
        primo = 0
        aux = 1
    return 0

primos(100)

'''
print('Pruebas de formatos de impresión')
print('--------------------------------')

var1 = 333
var2 = 205.5
var3 = 'Tripulantes'

print('Estas son mis variables', var1, var2, var3)
print('Var1: , Var2: , Var3: ', var1, var2, var3)
print('Var1:',var1 , 'Var2: ',var2, 'Var3: ', var3)
print(f'Var1: {var1}, Var2: {var2}, Var3: {var3}')
print(f'{var1} en base10 {var1}, en base2 {var1:b}, en base16 {var1:x}')
print(f'Real sin formato: {var2:.0f}')
print(f'Real con tres decimales: {var2:.3f}')
print(f'Real en formato exponencial: {var2:e}')
'''

# int: 5, 0x10, 0b10, 1245646546546464
# float: 0.5, 0.5e7, 1.7e215, -1.8e205
# string: 'Hola Tripulantes', "Hola Tripulantes", '', 'Hola\nTripulantes'
# complex: 0.5 + 2j
# boolean: True/False
# lista: [1, 3, 5], ['Hola', 'Mundo'], [1, 5, "Tripulantes", True]
#        [[1, 3, 4], ["Jhon", "Felipe", "Gabriel"]]
# tupla: (1, 3, 5), ('Hola', 'Mundo'), (1, 5, "Tripulantes", True)
#        (1, 3, 4), ("Natalia", "Felipe", "Gabriel"))
# diccionarios: {'Llave': valor, {'Natalia': 1, 'Felipe': 3, 'Gabriel': 4}}

r = range(2,10,2)

lista = [7, 67, 45, 76, 345, 6]
#print(lista[2])