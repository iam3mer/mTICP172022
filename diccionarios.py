diccionario = {}
diccionario = dict()

# {key: value}


diccionario = dict(PanelHuevos = 1800, Pizza = 40000)
diccionario = {'Panel Huevos': 1800}
#print(f"El panal de huevos vale: {diccionario['Panel Huevos']}")

diccionario['carne'] = 9000
diccionario['Panel Huevos'] = 14000
#print(diccionario)

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

directorio['Octavio']['habilidades']['programacion'] = True

persona = {
        'ciudad': 'Armenia',
        'profesion': 'Ingeniero Electrico',
        'habilidades': {
            'programacion': True,
            'bases_de_datos': False,
            'cocina': False,
            'frances': False
        }
    }

directorio['Christian'] = persona

#print(directorio.keys())
#print(directorio.values())
#directorio.clear()

'''
if 'Maria' in directorio.keys():
    print(True)
else:
    print(False)
'''

#print(directorio.get('Jhonatan'))
directorio.update(dict(Angie= {}))
directorio['Angie']['ciudad'] = 'Pereira'
directorio['Angie']['profesion'] = 'Ingeniera de Sistemas y Computación'
directorio['Angie']['habilidades']=dict(programacion=True,bases_de_datos=True,cocina=True,frances=False)

#print(len(directorio))

del directorio['Christian']
#print(directorio)

item = directorio.pop('Octavio')
print(item)
directorio['Jhonatan']['habilidades'].pop('frances')
print(directorio)
