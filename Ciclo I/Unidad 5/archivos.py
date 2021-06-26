from pprint import pprint as pp

# Guardar y Leer archivos con Pandas
import pandas as pd
from pandas.io.pytables import IndexCol

datos = {
    'nombres': ['Alejandro', 'Andres', 'David', 'Sebastian'],
    'apellidos': ['Aristizabal', 'Giraldo', 'Tabares', 'Ceballos'],
    'edad': [21,19,24,22],
    'reto_1': [4, 4.5, 5, 4.8],
    'reto_2': [4.8, '?', 5, '?']
}

#pp(datos)

datosDF = pd.DataFrame(datos)
#print(datosDF)

# DF a CSV
datosDF.to_csv('infoTripulantes.csv')

leerDFCSV = pd.read_csv(
    'infoTripulantes.csv',
    skiprows=1,
    names=['ID', 'Nombre', 'Apellido', 'Edad', 'Nota Reto 1', 'Nota Reto 2'],
    index_col='ID',
    na_values=['?']
)

#print(leerDFCSV)

# DF a XLSX
# pip install openpyxl

leerDFCSV.to_excel('infoTripulantes.xlsx', sheet_name='Tripulantes')

leerDFXLSX = pd.read_excel(
    'infoTripulantes.xlsx',
    sheet_name='Tripulantes',
    index_col=0
)
#print(leerDFXLSX)

# Manipulación de archivos con Python
# Modos de lectura
# r : Lectura.
# w : Escritura. Remplaza el contenido del archivo. Si el archivo no existe lo crea.
# a : Escritura. Conserva contenido del archivo. Añade datos al final.
# r+, w+, a+
# rb, wb, ab, rb+, wa+, ab+

datos = ['Esta es la unidad 5 del ciclo 1', 'Aprendemos a manipular archivos']

# Escribir documento
fichero = open('ejemploArchivo.txt', 'w+')

for line in datos:
    # fichero.write(line)
    # print(line, file=fichero)
    pass

fichero.writelines('%s\n' % line for line in datos)

# Leer documento
fichero = open('ejemploArchivo.txt', 'r')
lines = fichero.readlines()
#print(lines)
for line in lines:
    #print(line, end='')
    pass

lines = list(fichero)
#print(lines)

#lines = [line.rsplit('\n') for line in lines]
#print(lines)

# Leer liena a linea
lines = []

for line in fichero:
    lines.append(line)
#print(lines)

fichero.close()

# Archivos JSON
import json

datos = {
    'nombres': ['Alejandro', 'Andres', 'David', 'Sebastian'],
    'apellidos': ['Aristizabal', 'Giraldo', 'Tabares', 'Ceballos'],
    'edad': [21,19,24,22],
    'reto_1': [4, 4.5, 5, 4.8],
    'reto_2': [4.8, '?', 5, '?']
}

datos = {}
datos['tripulantes'] = []

datos['tripulantes'].append({
    'nombre': 'Alejandro',
    'apellido': 'Aristizabal',
    'edad': 21,
    'notas': [4,4.8]
})

datos['tripulantes'].append({
    'nombre': 'Andres',
    'apellido': 'Giraldo',
    'edad': 19,
    'notas': 4.5
})

datos['tripulantes'].append({
    'nombre': 'David',
    'apellido': 'Tabares',
    'edad': 24,
    'notas': [5,5]
})

with open('infoTripulantes.json', 'w') as fichero:
    json.dump(datos, fichero, indent=4, ensure_ascii=False, sort_keys=True)

with open('infoTripulantes.json') as fichero:
    infoJSON = json.load(fichero)
    ##pp(infoJSON)

# Cargar archivos desde URL
# Opción 1
import requests

respuesta = requests.get('http://citibikenyc.com/stations/json')
respuestaJSON = json.loads(respuesta.content)
#pp(respuestaJSON)

# Opción 2
#respuestaJSON = pd.read_json('http://citibikenyc.com/stations/json')
#pp(respuestaJSON.columns)
#pp(respuestaJSON.index)
#pp(respuestaJSON.head(5))

#data = pd.DataFrame(respuestaJSON.loc[:, ['stationBeanList']])

#pp(respuestaJSON['stationBeanList'])
data = pd.DataFrame(respuestaJSON['stationBeanList'])
#print(data.columns)
# print(data)
data = data.loc[:, ['stationName', 'availableDocks', 'totalDocks', 'lastCommunicationTime']]

#pp(data[data['availableDocks'] == 18])
data = data[data['availableDocks'].notna()]
data = data.dropna(how='all')
# print(list(data.iloc[0,:]))
data.loc[509] = list(data.iloc[0,:])
# data.append(list(data.iloc[0,:]))
# print(data.shape)
# data = data.drop_duplicates(['stationName'])
# print(data.shape)

unicosavailableDocks = list(data['availableDocks'].unique())
unicostotalDocks = list(data['totalDocks'].unique())

# print(list(unicosavailableDocks), list(unicostotalDocks))

unicos1 = set(unicosavailableDocks)
unicos2 = set(unicostotalDocks)

unicos = list(unicos1.union(unicos2))

# print(len(unicosavailableDocks), len(unicos1))
# print(len(unicostotalDocks), len(unicos2))
# print(len(unicos))

# print(data)
data.set_index('stationName', inplace=True)
# print(data)
# print(data['availableDocks']['W 52 St & 11 Ave'])
# data['availableDocks']['W 52 St & 11 Ave'] = 15
data = data.transpose()
# print(data)
# print(data.loc['totalDocks',:].sum())

data = data.transpose()
# print(data)

import math
data['availableDocks'] = data['availableDocks'].apply(math.sqrt)
data = data.drop(['lastCommunicationTime'], axis=1)
# print(data['totalDocks'].sum())
# print(data)

ordenados = data.sort_values('availableDocks', ascending=False)
# print(ordenados)

salida = {'Columbus Ave & W 72 St': data['availableDocks']['Columbus Ave & W 72 St']}
print(json.dumps(salida, indent=4))

