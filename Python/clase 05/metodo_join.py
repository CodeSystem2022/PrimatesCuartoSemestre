
# help(str.join)

tupla_str = ('Hola', 'alumnos', 'Tecnicatura', 'Universitaria')
mensaje = ' '.join(tupla_str)
print(f'Mensaje: {mensaje}')

lista_cursos = ['Java', 'Python', 'Angular', 'Spring']
mensaje = ', '.join(lista_cursos)
print(f'Mensaje: {mensaje}')

cadena = 'HolaMundo'
mensaje = '.'.join(cadena)
print(f'Mensaje: {mensaje}')

diccionario = {'nombre': 'Juan', 'apellido': 'Perez', 'edad': '10'}
llaves = '-'.join(diccionario.keys())
valores = '-'.join(diccionario.values())
print(f'llaves: {llaves},type: {type(llaves)}')
print(f'Valores: {valores}, type: {type(valores)}')