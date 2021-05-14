def cargaGaseosa(amigo_1:dict=0,amigo_2:dict=0,amigo_3:dict=0,misDatos:dict={})->dict:

    SERVIR = 5

    vaso1 = amigo_1['capacidad_actual'] + SERVIR
    vaso2 = amigo_2['capacidad_actual'] + SERVIR
    vaso3 = amigo_3['capacidad_actual'] + SERVIR

    s1 = vaso1 > amigo_1['capacidad_vaso']
    s2 = vaso2 > amigo_2['capacidad_vaso']
    s3 = vaso3 > amigo_3['capacidad_vaso']

    # Si a los tres se les riega devolver el nombre de los tres
    if s1 and s2 and s3:
        contador = misDatos['contador'] + 1
        return {'contador': contador}, {1: amigo_1['nombre'], 2: amigo_2['nombre'], 3: amigo_3['nombre']}
    elif s1 and s2:
        return amigo_1['nombre'], amigo_2['nombre']
    elif s1 and s3:
        return amigo_1['nombre'], amigo_3['nombre']
    elif s2 and s3:
        return amigo_2['nombre'], amigo_3['nombre']
    elif s1:
        return amigo_1['nombre']
    elif s2:
        return amigo_2['nombre']
    elif s3:
        return amigo_3['nombre']
    else:
        return None


vAmigo1={'nombre': 'Juan', 'capacidad_vaso': 15, 'capacidad_actual': 10}
vAmigo2=dict(nombre='Esteban',capacidad_vaso=15,capacidad_actual=5.8)
vAmigo3={'nombre':'Angelica','capacidad_vaso':15,'capacidad_actual': 12}
# Angelica

vAmigo1={'nombre': 'Juan', 'capacidad_vaso': 10, 'capacidad_actual': 8}
vAmigo2=dict(nombre='Esteban',capacidad_vaso=10,capacidad_actual=3)
vAmigo3={'nombre':'Angelica','capacidad_vaso':10,'capacidad_actual': 7.4}
# (Juan, Angelica)

vAmigo1={'nombre': 'Juan', 'capacidad_vaso': 10, 'capacidad_actual': 8}
vAmigo2=dict(nombre='Esteban',capacidad_vaso=10,capacidad_actual=7)
vAmigo3={'nombre':'Angelica','capacidad_vaso':10,'capacidad_actual': 2}
# (Juan, Esteban)

vAmigo1={'nombre': 'Juan', 'capacidad_vaso': 10, 'capacidad_actual': 3}
vAmigo2=dict(nombre='Esteban',capacidad_vaso=10,capacidad_actual=7.5)
vAmigo3={'nombre':'Angelica','capacidad_vaso':10,'capacidad_actual': 6.8}
# (Juan, Angelica)

vAmigo1={'nombre': 'Juan', 'capacidad_vaso': 10, 'capacidad_actual': 3}
vAmigo2=dict(nombre='Esteban',capacidad_vaso=10,capacidad_actual=4)
vAmigo3={'nombre':'Angelica','capacidad_vaso':10,'capacidad_actual': 5}
# (Juan, Angelica)

vAmigo1={'nombre': 'Juan', 'capacidad_vaso': 15, 'capacidad_actual': 12.4}
vAmigo2=dict(nombre='Esteban',capacidad_vaso=15,capacidad_actual=14)
vAmigo3={'nombre':'Angelica','capacidad_vaso':15,'capacidad_actual': 11}
# (Juan, Esteban, Angelica)

#print(cargaGaseosa(vAmigo1, vAmigo2, vAmigo3))

estado = {'contador': 0}
estado, mensaje = cargaGaseosa(vAmigo1, vAmigo2, vAmigo3, estado)
print(estado)
estado, mensaje = cargaGaseosa(vAmigo1, vAmigo2, vAmigo3, estado)
print(estado)


