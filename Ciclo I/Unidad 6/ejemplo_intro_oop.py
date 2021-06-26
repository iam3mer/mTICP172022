from pprint import pprint as pp

clientes = [
    {'Nombre': 'Alejandro', 'Apellidos': 'Aristizabal', 'nuip': 21545845},
    {'Nombre': 'Breyner', 'Apellidos': 'Ocampo Cardenas', 'nuip': 45257845},
    {'Nombre': 'Didier', 'Apellidos': 'Llanten Velez', 'nuip': 5464646}
]

def mostrar_cliente(clientes:list, nuip:int):
    for cliente in clientes:
        if nuip == cliente['nuip']:
            print(f'{cliente["Nombre"]} {cliente["Apellidos"]}')
            return
    print('Cliente no encontrado')

def eliminar_cliente(clientes:list, nuip:int):
    for i, cliente in enumerate(clientes):
        if nuip == cliente['nuip']:
            del(clientes[i])
            print(str(cliente), '> ELIMINADO')
            return
    print('Cliente no encontrado')

# print('--------------- Listar Clientes ---------------')
# pp(clientes)

# print('--------------- Mostrar Cliente ---------------')
# mostrar_cliente(clientes, 45257845)
# mostrar_cliente(clientes, 5458646)

# print('--------------- Borrar Cliente ----------------')
# eliminar_cliente(clientes, 65449485)
# eliminar_cliente(clientes, 5464646)

# print('--------------- Listar Clientes ---------------')
# pp(clientes)

class Cliente:

    def __init__(self, nuip, nombre, apellidos):
        self.nuip = nuip
        self.nombre = nombre
        self.apellidos = apellidos

    def __str__(self):
        return f'{self.nombre} {self.apellidos}'


class Directorio:

    def __init__(self, clientes=[]):
        self.clientes = clientes

    def mostrar_cliente(self, nuip=None):
        for cliente in self.clientes:
            if cliente.nuip == nuip:
                print(cliente)
                return
        print('Cliente No Encontrado')

    def eliminar_cliente(self, nuip=None):
        for i, cliente in enumerate(self.clientes):
            if cliente.nuip == nuip:
                del(self.clientes[i])
                print(str(cliente), '> ELIMINADO')
                return
        print('Cliente No Encontrado')


# Crear algunos clientes
alejandro = Cliente(nombre='Alejandro', apellidos='Aristizabal', nuip=21545845)
breyner = Cliente(nombre='Breyner', apellidos='Ocampo Cadenas', nuip=45257845)
didier = Cliente(nombre='Didier', apellidos='Llanten Velez', nuip=5464646)

# Crear un directorio con los clientes iniciales
directorio = Directorio(clientes=[alejandro, breyner, didier])

print('-------------- Listar Clientes ---------------')
print(directorio.clientes)

print('-------------- Mostrar Cliente ---------------')
directorio.mostrar_cliente(5464646)
directorio.mostrar_cliente(2455475)

print('-------------- Borrar Cliente ----------------')
directorio.eliminar_cliente(5412585)
directorio.eliminar_cliente(21545845)

print('-------------- Listar Clientes ---------------')
directorio.clientes

