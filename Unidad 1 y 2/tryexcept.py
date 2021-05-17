temp_fahr = input('Ingrese la temperatura en grados Fahrenheit: ')

try:
    fahr = float(temp_fahr)
    cel = (fahr - 32) * 5.0/9.0
    print(f"{cel} Cº")
except ValueError:
    print("Debe ingresar un numero.")
finally:
    print("Se ejecuta siempre")