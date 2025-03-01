array = []
sum = 0
n = int(input("Número de ordenados: "))

for i in range(n):
    ordenado = float(input("Ordenados: "))
    array.append(ordenado)
    sum += ordenado
ordenado_medio = sum / n

for i in range(len(array)):
    print(f'{array[i]}: {array[i] - ordenado_medio} ')