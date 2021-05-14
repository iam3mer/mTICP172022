from math import ceil

def a(nuip: int, meses:list()) -> tuple:
    v1 = meses[0]
    v2 = meses[1]
    v3 = meses[2]

    return nuip, ceil(v1), ceil(v2), ceil(v3)

print(a(45345, [105, 35.2, 140.2]))