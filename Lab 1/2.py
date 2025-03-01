sum = 0
nota = 0
count = 0
while nota >= 0:
    nota = float(input("Nota: "))
    if nota < 0:
        break
    else:
        sum += nota
        count += 1
media = sum / count
print(f'Média: {media}')
