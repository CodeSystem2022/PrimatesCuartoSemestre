#Profundizando en los sistemas de numeración

#Sistema decimal
a = 10 #decimal sirve para representar números naturales
print(f'a decimal: {a}')
#Sistema binario
a = 0b1010 #binario sirve para representar 0 y 1
print(f'a binario: {a}')

#Sistema octal
a = 0o12 #octal sirve para representar permisos de archivos
print(f'a octal: {a}')

#Sistema hexadecimal
a = 0xA #hexadecimal sirve para representar colores
print(f'a hexadecimal: {a}')

# base decimal
a = int('23', 10)
print(f'a decimal: {a}')

# base binaria
a = int('10111', 2)
print(f'a binario: {a}')

# base octal
a = int('27', 8)
print(f'a octal: {a}')

# base hexadecimal
a = int('17', 16)
print(f'a hexadecimal: {a}')

# base 5 sus valores son de 0 a 4
a = int('432', 5) #se muestra un error al poner un numero mayor a 4 que seria el valor maximo
print(f'a base 5: {a}')


