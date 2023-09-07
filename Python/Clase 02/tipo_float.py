#profundiza en el tipo de dato float
a = 3.0


#Constructor de tipo float -> puede recibir int y str como argumentos y los convierte a float
a = float(10)
a = float('10')# Le pasamos un tipo entero
print(f'a: {a:.2f}')

# Notación exponencial (valores positivos o negativos)
a = 3e50 # sirve para representar números muy grandes
print(f'a: {a:.2f}')

a = 3e-5 # sirve para representar números muy pequeños
print(f'a: {a:.5f}')

# cualquier calculo que incluyo un float, todo cambia a float

a = 4.0 + 5
print(a)
print(type(a))