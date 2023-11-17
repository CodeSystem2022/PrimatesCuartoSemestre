# Profundizando en tipo float.
a = 3.0
print('a: {}'.format(a))

# Constructor de tipo float -> puede recibir int y str.
a = float(10)
a = float('10')
print('a: {}'.format(a))

# Notación exponencial.
a = 3e12
print(f'a: {a:.2f}')

a = 3e-12
print(f'a: {a:.12f}')

# Cualquier cálculo que incluye un float, todo cambia a float

a = 0.4 + 5
print(a)
print(type(a))