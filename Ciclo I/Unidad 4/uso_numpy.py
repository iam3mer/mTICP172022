# Instalar Numpy : pip install numpy
import numpy as np

#np.array(lista o tupla)

# Array de una dimensión (eje 0)
a1 = np.array([1,2,3])
#print(a1,'\n')
#print(a1.shape)

# Array de dos dimensiones (eje 0, 1)
a2 = np.array([[1,2,3],[4,5,6]])
#print(a2,'\n')
#print(a2.shape)

# Array de tres dimensiones (eje 0, 1, 2)
a3 = np.array([[[1,2],[3,6],[3,4]],[[1,2],[3,6],[3,4]],[[1,2],[3,6],[3,4]],[[6,4],[5,6],[7,8]]])
#print(a3,'\n')
#print(a3.shape)

#print(len(a3))
#print(a3.shape[2])

# Array vacío
vacia = np.empty([2,3])
#print(vacia, '\n')

# Array Zeros
zeros = np.zeros([3,3])
#print(zeros, '\n')

# Array Unos
unos = np.ones((4,3))
#print(unos, '\n')

# Array 'X'
matriz7 = np.full([5,5], 7)
#print(matriz7, '\n')

# Matriz Identidad
identidad = np.identity(7)
#print(identidad, '\n')

# Matriz con numeros aleatorios
aleatorios = np.random.random([4,3])
#print(aleatorios, '\n')

#print(aleatorios[1,2]) # Consultar el valor de la posición 1, 2

m1 = np.array(((1,5),(5,4)))
m2 = np.array(((5,8),(6,1)))

print(m1 + m2)
print(m1 - m2)
print(m1 / m2)
print(m1 * m2)
print(m1.dot(m2))
