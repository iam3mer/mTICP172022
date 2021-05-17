def esPrimo(num: int, n: int):
    if n >= num:
        return print('Es primo.')
    elif num % n != 0:
        return esPrimo(num, n+1) # Recursividad
    else:
        return print(f"{num} No es primo. {n} es divisor")
        
esPrimo(555555412154746465465456874946, 2)