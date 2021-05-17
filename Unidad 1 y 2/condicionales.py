# Condicional Secuencial
def definirNumero(num: int) -> str:
    if num == 0:
        return "El numero es 0."
    if num < 0:
        return "El numero es negativo."
    if num > 0:
        return "El numero es positvo"

#print(definirNumero(5))

# Condicional en Cascada
def cifras(num: int) -> str:
    if num > 0 and num < 10:
        return f"{num} es de una cifra."
    elif num > 9 and num < 100:
        return f"{num} es de dos cifras."
    else:
        if num > 99 and num < 1000:
            return f"{num} es de tres cifras."
        else:
            if num > 999 and num < 10000:
                return f"{num} es de cuatro cifras."
            else:
                if num < 0:
                    return f"{num} es un valor negativo."
                else:
                    return f"{num} tiene más de cuatro cifras." 

# print(cifras(5842458))

# Decisiones anidada

def numero(num: int) -> str:

    if num == 0:
        return 0

    if num > 0:
        if num > 9 and num < 100:
            return f"{num} es de dos digitos."
    else:
        if num < -99 and num > -1000:
            return f"{num} es de tres digitos."

# print(numero(-1000))

# D: 0 - 1.99
# I: 2 - 2.99
# A: 3 - 3.99
# S: 4 - 4.8
# E: 4.9 - 5

def nota(num: float) -> str:

    if num >= 0 and num <= 5:
        if num >= 0 and num <= 1.99:
            return "D"
        elif num >= 2 and num <= 2.99:
            return "I"
        elif num >= 3 and num <= 3.99:
            return "A"
        elif num >= 4 and num <= 4.8:
            return "S"
        else:
            return "E"
    else:
        return "El valor ingresado no tiene sentido para la función."

print(nota(5.2))
