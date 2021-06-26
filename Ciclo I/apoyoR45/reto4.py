from functools import reduce

positivos_C19 = {
    'Colombia': {
        'Risaralda': [('Pereira', 45), ('Dosquebradas', 15), ('La Virginia', 30)],
        'Quindio': [('Armenia', 75), ('Montenegro', 86)]
    },
    'Mexico': {
        'Quintana Roo': [('Benito Juarez', 101), ('Solidaridad', 56)],
        'Nayarit': [('Compostela', 23), ('San Blas', 35), ('Xalisco', 74), ('Del Nayar', 46)]
    }
}

def promedio(datos:list)->int:
    # promedio = round(reduce(lambda x, y: x + y, datos) / len(datos), 2)
    suma = 0
    for i in range(len(datos)):
        suma = suma + datos[i]
    promedio = round(suma / len(datos), 2)
    return promedio

def analizaPacientes ( opt :int , db:dict , pais :str=''):

    promedios = {}

    try:
        if opt == 0 and pais != '':
            respuesta = 'La opción no recibe país'
        elif opt == 0:
            for pais in db:
                pacientes = []
                ciudades = db[pais]
                for ciudad in ciudades:
                    for i in range(len(ciudades[ciudad])):
                        pacientes.append(ciudades[ciudad][i][1])
                promedios[pais] = promedio(pacientes)
            respuesta = promedios

        elif opt == 1:
            ciudades = db[pais]
            for ciudad in ciudades:
                pacientes = []
                for i in range(len(ciudades[ciudad])):
                    pacientes.append(ciudades[ciudad][i][1])
                promedios[ciudad] = promedio(pacientes)
            respuesta = promedios

        elif opt == 2:
            ciudadMax = ('',0)
            departamentos = db[pais]
            for departamento in departamentos:
                ciudades = departamentos[departamento]
                for ciudad in ciudades:
                    if ciudad[1]>ciudadMax[1]:
                        ciudadMax = ciudad
            respuesta = ciudadMax

        else:
            respuesta = 'La opción no es valida'
    except:
        respuesta = 'La opción ingresada requiere de un país valido'
    
    return respuesta

print(analizaPacientes(0, positivos_C19))
print(analizaPacientes(2, positivos_C19, 'Colombia'))
print(analizaPacientes(1, positivos_C19, 'Mexico'))
print(analizaPacientes(2, positivos_C19, 'Mexico'))
print(analizaPacientes(5, positivos_C19))