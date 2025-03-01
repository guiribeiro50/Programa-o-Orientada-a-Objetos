sum = 0
numeros = []
notas = []
for i in range(3):
    numero = int(input("Número: "))
    nota = float(input("Nota: "))
    notas.append(nota)
    numeros.append(numero)
    sum += nota
media = sum / 3
print(f'Média: {round(media, 2)}')

for i in range(len(notas)):
    if notas[i] > media:
        print(f'Aluno {numeros[i]}: {notas[i]}')
