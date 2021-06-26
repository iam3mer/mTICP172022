# Clases y Objetos ------------------------------------------------
# Los objetos son instancias de una clase. Puedo verlos como un nuevo tipo de dato
# que se define a partir de un estructura (class)

numero = 7
# print(type(numero))

def fun():
    pass
# print(type(fun))

class Animal:
    pass

un_animal = Animal()
otro_animal = Animal()

# print(un_animal)
# print(otro_animal)

# print(Animal)
# print(type(un_animal))
# print(un_animal.__class__)
# print(otro_animal.__class__.__name__)

# Atributos y Metodos ------------------------------------------------

gato = Animal()
gato.color = 'gris'
gato.sexo = 'macho'

# print(f'El color del gato es {gato.color} y es un {gato.sexo}')

class Animal:
    gris = True

gato = Animal()

# print(f'El valor por defecto para el atributo "gris" de la clase Animal es: {Animal.gris}')

# gato.gris = False

# if gato.gris:
#     print('El gato es gris')
# else:
#     print('El gato no es gris')

Animal.gris = False

gato2 = Animal()

# if gato2.gris:
#     print('El gato es gris')
# else:
#     print('El gato no es gris')

class Animal:
    color = 'gris'

    def saludar(soy_yo_el_objeto):
        print(f'Hola, soy un fantastico animal!')
        print(soy_yo_el_objeto)

# Animal.saludar()

animal = Animal()
# animal.saludar()
# print(animal)

class Animal:
    color = 'gris'

    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño

    # def __del__(self):
    #     print(f'{self.nombre} se está borrando de la memoria.')

    def __str__(self):
        return(f'El animal tiene por nombre {self.nombre} y su color es {self.color}')

    def __len__(self):
        return self.tamaño

    def cambiar_color(self):
        self.color = 'naranja'

animal = Animal('Lazzy', 40)
# animal.cambiar_color()
# print(animal.color)

# print(animal)

# print(len(animal))
# print(animal.__len__)

# del(animal)
# animal.__del__

# Encapsulamiento ---------------------------------------------------------

class EstaEsUnaClase:
    __atributo_privado = 'Soy el atributo privado, no puedo ser alcanzado desde afuera.'

    def __metodo_privado(self):
        print('Soy un metodo privado, no puedo ser alcanzado desde afuera.')

    def atributo_publico(self):
        return self.__atributo_privado

    def metodo_publico(self):
        return self.__metodo_privado()


x = EstaEsUnaClase()
# print(x.__atributo_privado)
# x.__metodo_privado()

# print(x.atributo_publico)
# x.metodo_publico

# Herencia --------------------------------------------------------------

# SuperClase
class Producto:
    # def __init__(self, ref, tipo, nombre, des, distribuidor=None, autor=None, isbn=None):
    def __init__(self, ref, nombre, des, pvp):
        self.ref = ref
        # self.tipo = tipo
        self.nombre = nombre
        self.des = des
        # self.distribuidor = distribuidor
        # self.autor = autor
        # self.isbn = isbn
        self.pvp = pvp

    def __str__(self):
        return f'REFERENCIA\t {self.ref}\n' \
               f'NOMBRE\t {self.nombre}\n' \
               f'DESCRIPCIÓN\t {self.des}\n' \
               f'PVP\t {self.pvp}\n'

# celular = Producto('Zenphone 5', 'CELULAR', 'Celular Asus', 'Celular marca Asus')

# Subclase

class Celular(Producto):
    pass

celular = Celular('Zenphone 5', 'CELULAR', 'Celular marca Asus', 1570000)
# print(celular)

class Libro(Producto):
    autor = ''
    isbn = ''

    def __str__(self):
        return f'REFERENCIA\t {self.ref}\n' \
               f'NOMBRE\t {self.nombre}\n' \
               f'DESCRIPCIÓN\t {self.des}\n' \
               f'AUTOR\t {self.autor}\n' \
               f'ISBN\t {self.isbn}\n'

libro = Libro('Libro 1', 'Cien años de soledad', 'La historia de Macondo', 60000)
libro.autor = 'Gabriel Garcia Marquez'
libro.isbn = 'lhkj56hg5j6g'
# print(libro)

# Polimorfismo -----------------------------------------------------

def rebajar_producto(producto, rebaja):
    producto.pvp = producto.pvp - (producto.pvp * rebaja / 100)

print(celular)
rebajar_producto(celular, 10)
print(celular)