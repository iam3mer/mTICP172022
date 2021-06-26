# for

#nombre = 'Angie'
#for caracter in nombre:
#    print(caracter)

#for num in range(10):
#    print(num)

#for num in range(10, 0, -1):
#    print(num)

'''
frase = 'El éxito en la vida no se mide por lo que logras sino por los obstáculos que superas'
palabras = frase.split()
print(palabras)
for palabra in palabras:
    print(f'La palabra "{palabra}" tiene una longitud de: {len(palabra)}.')
'''

directorio ={
    'Jhonatan': {
        'ciudad': 'Pereira',
        'profesion': 'Ingeniero de Sistemas y Computación',
        'habilidades': {
            'programacion': True,
            'bases_de_datos': True,
            'cocina': True,
            'frances': False
        }
    },
    'Octavio': {
        'ciudad': 'Manizales',
        'profesion': 'Ecomista',
        'habilidades': {
            'programacion': False,
            'bases_de_datos': False,
            'cocina': True,
            'frances': True
        }
    }
}

'''
llaves = directorio.keys()
valores = directorio.values()
# item
# [(key1, value1),(key2,value2)]
datos = directorio.items()
print(datos)

for llave, valor in datos:
    print(f'Esta es la llave "{llave}" y este es el valor {valor}')
else:
    print("Esto siempre se va ha imprimir")
'''
