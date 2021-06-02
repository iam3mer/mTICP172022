numeros = [452,354,465,0,546,3,-7,8,56,546]

# ANY
if numeros[0]%2 != 0 or numeros[1]%2 != 0 or numeros[2]%2 != 0:
    pass

# ALL
if numeros[0]%2 != 0 and numeros[1]%2 != 0 and numeros[2]%2 != 0:
    pass

impares = list(map(lambda num: num%2 != 0, numeros))
#print(impares)

#print(all(impares)) # False, no todos los numeros en la lista son impares
#print(any(impares)) # True, por lo menos uno de los numeros en la lista es impar

# Casos especiales
#print(all([])) # True
#print(any([])) # False

info = [int(input()), input().split()]
#info = [5, ['354','3564','6456','5','3678']]

print(
    True
    if all(
        list(map(
            lambda x: x>0,
            list(map(int, info[1]))
        ))
    )
    and any(
        list(map(
            lambda x: x[0] == x[1] or x[0] == info[0],
            list(zip(
                info[1],
                list(map(lambda x: x[-1:(len(x)+1)*-1:-1], info[1]))
            ))
        ))
    )
    else False
)
print()

# ALL
print(list(map(int, info[1])))
print(list(map(
            lambda x: x>0,
            list(map(int, info[1]))
        )))
print(all(list(map(
            lambda x: x>0,
            list(map(int, info[1]))
        ))))
print()

# ANY
print(list(map(lambda x: x[-1:(len(x)+1)*-1:-1], info[1])))
print(list(zip(
                info[1],
                list(map(lambda x: x[-1:(len(x)+1)*-1:-1], info[1]))
            )))
print(list(map(
            lambda x: x[0] == x[1] or x[0] == '7',
            list(zip(
                info[1],
                list(map(lambda x: x[-1:(len(x)+1)*-1:-1], info[1]))
            ))
        )))
print(any(list(map(
            lambda x: x[0] == x[1] or x[0] == '7',
            list(zip(
                info[1],
                list(map(lambda x: x[-1:(len(x)+1)*-1:-1], info[1]))
            ))
        ))))
