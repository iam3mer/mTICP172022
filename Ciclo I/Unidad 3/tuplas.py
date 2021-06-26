# Tuplas
unaTupla = (34, 'Cadena', 5, (3,7,98), 5, [], {})
unaTupla = 34, 'Cadena', 5, (3,7,98), 5, [], {}
#print(unaTupla[1:4])

#unaTupla[0] = 345 # No se puede

# print((0,1,10) > (0,4,7)) # Retorna el boleano de la primera comparación valida.
# Si son iguales sigue comparando

frase = 'El éxito en la vida no se mide por lo que logras sino por los obstáculos que superas'
palabras = frase.split()
diccionarioLista = []
for palabra in palabras:
    diccionarioLista.append((len(palabra), palabra))
#print(diccionarioLista)

# Mostrar la tupla en unaTupla
#print(unaTupla[3][1])

#print(unaTupla.index('Cadena'))

palabra = tuple('onomatopeya')
palabra = list(palabra)
#print(palabra)
palabra = palabra.reverse()
#print(palabra)