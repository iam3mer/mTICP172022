unaLista = [34, 'Cadena', 5, [3,7,98], 5, (), {}]
#for item in unaLista:
#    print(item)

#unaLista.append(6)
#print(unaLista)

#unaLista.extend('do')
#print(unaLista)

#print(unaLista.count(5))
#print(unaLista.index(5))
#unaLista.insert(1, 76)
#print(unaLista)

#unaLista.remove(5)
#print(unaLista)

#unaLista.reverse()
#print(unaLista)

#nombres = ['Juan', 'Breyner', 'David', 'Didier', 'Jair', 'Sebastian']
#nombres.sort()
#print(nombres)

numeros = (4,56,7,7,4,4,78,6,8,8,5,56)
numeros = list(numeros)
#print(numeros)

palabra = 'onomatopeya'
palabra = list(palabra)
#print(palabra)

numeros = [[32,546,75,6],
            [3453,45764,675768,5656],
            [4567,354637,578,534]]
#print(numeros[0][0])
#print(numeros[1][0])
#print(numeros[2][0])

'''
for num in range(len(numeros)):
    print(numeros[num][0])
print('-----')
for num in numeros:
    print(num[0])
'''

for lista in numeros:
    for item in lista:
        print(item)