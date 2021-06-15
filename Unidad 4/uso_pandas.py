# Instalar Pandas : pip install pandas
import pandas as pd

# Series (vector)
# Series(datos, indices, tipo)
s = pd.Series(['Ingles', 'Matematicas', 'Español'])
#print(s)

s = pd.Series([4,5,4.7], ['Ingles', 'Matematicas', 'Español'], dtype='string')
#print(s['Matematicas'])

s = pd.Series({'Ingles': 4, 'Matematicas': 5, 'Español': 4.7})
#print(s)

#print(s.size)
#print(s.index)
#print(s.dtype)

#print(s[s>4.6])

from math import cos
#print(s.apply(cos))

#print(s.min())
#print(s.max())

# DataFrame (tablas, matriz)
# DataFrame(datos, indiceF, indiceC, tipos)

datos = {
    'nombres': ['Alejandro', 'Sebastian', 'Breyner'],
    'edades': [23, 21, 19],
    'asignaturas': ['Ingles', 'Matematicas', 'Español'],
    'notas': [4, 5, 4.7]
}

infoDF = pd.DataFrame(datos)
#print(infoDF)

datos = [
    {'nombre': 'Alejandro', 'edad': 23},
    {'nombre': 'Sebastian', 'edad': 21},
    {'nombre': 'Breyner'}
]
infoDF = pd.DataFrame(datos)
#print(infoDF)

#print(infoDF.loc[0, 'nombre'])
#print(infoDF.iloc[0, 1]) # Requiere que los indices sean numericos

#print(infoDF.info())
#print(infoDF.shape)
#print(infoDF.columns)
#print(infoDF.index)
#print(infoDF.head(1))
#print(infoDF.tail(1))

# Añadir nueva información
# df[nombreCol] = serie
infoDF['ciudad'] = ['Pereira', 'Cali', 'Bogotá']
#print(infoDF)

print(infoDF['edad'].apply(cos))

del infoDF['ciudad']
serie = infoDF.pop('edad')

# Panel (cubos)