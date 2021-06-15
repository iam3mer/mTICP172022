from matplotlib import colors
import matplotlib.pyplot as plt
from random import randrange
import pandas as pd

x1 = [randrange(1,10,2) for _ in range(6)]
y1 = [randrange(6,20,3) for _ in range(6)]

x2 = [randrange(2,12,2) for _ in range(6)]
y2 = [randrange(3,25,3) for _ in range(6)]

# print(x1,y1, x2, y2)

# Graficar Lineas
# plt.plot(x1, y1, color="red", linewidth = 2, label = 'Serie 1')
# plt.plot(x2, y2, color="yellow", linewidth = 2, label = 'Serie 2')
# plt.title('Mi primer grafico en PLT')
# plt.xlabel('Axis X')
# plt.ylabel('Axis Y')
# plt.legend()
# plt.grid()
# plt.show()

# Grafico de barras

# plt.bar(x1, y1, color="red", linewidth=2, label="Bar 1")
# plt.bar(x2, y2, color="black", linewidth=2, label="Bar 1")
# plt.title('Barras')
# plt.xlabel('Axis X')
# plt.ylabel('Axis Y')
# plt.legend()
# plt.grid()
# plt.show()

Datos = [20,22,21,20,23,25,28,40,22,23,22,15,16,18,18,19,21,22,24,4,12,17,17,22,30,]
Rangobin=[0,10,20,20,30,40]

# plt.hist(Datos, Rangobin, histtype='bar', rwidth=0.8, color='blue')
# plt.title('Histograma')
# plt.xlabel('Axis X')
# plt.ylabel('Axis Y')
# plt.show()

# plt.scatter(x1, y1, color='blue', label='Puntos 1')
# plt.scatter(x2, y2, color='red', label='Puntos 2')
# plt.title('Scatter')
# plt.xlabel('Axis X')
# plt.ylabel('Axis Y')
# plt.legend()
# plt.grid()
# plt.show()

# etiquetas = ['v1','v2','v3','v4','v5','v6']
# colores = ['blue', 'red', 'yellow', 'green', 'orange', 'purple']
# plt.pie(x1, labels=etiquetas, colors=colores, startangle=90, shadow=True, autopct='%1.1f%%')
# plt.show()

# --------------------------------------------------
dataDF = pd.read_csv('https://raw.githubusercontent.com/jorisvandenbossche/pandas-tutorial/master/data/titanic.csv')
# print(dataDF.head(5))

cantidades = dataDF.Survived.value_counts()
print(cantidades)

plt.figure(figsize=(30,20))

plt.subplot2grid((2,2),(0,0))
dataDF.Survived.value_counts().plot(kind='bar', alpha=0.5)
plt.title('Numero de Sobrevivientes')

plt.subplot2grid((2,2),(0,1))
dataDF.Survived.value_counts(normalize=True).plot(kind='bar', alpha=0.5)
plt.title('% Sobrevivientes')

plt.subplot2grid((2,2),(1,0))
dataDF.Survived.value_counts().plot(kind='bar', alpha=0.5)
plt.title('Numero de Sobrevivientes')

plt.subplot2grid((2,2),(1,1))
plt.bar(cantidades[0], cantidades[1], color='red', linewidth=2, label='Barra 1')

plt.title('Dos Barras Juntas')
plt.xlabel('Axis X')
plt.ylabel('Axis Y')
plt.legend()
plt.grid()
# plt.show()
