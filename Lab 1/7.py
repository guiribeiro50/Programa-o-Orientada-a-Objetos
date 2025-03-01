def search(residentes, target):
    for r, entrada, andar in residentes:
        if r == target:
            print(f'Entrada: {entrada}')
            print(f'Andar: {andar}')
            return ""
    return "O residente não existe."


residentes = []

for i in range(4):
    for j in range(3):
        residente = str(input("Nome: "))
        residentes.append((residente, i + 1, j + 1))

target = str(input("Residente a procurar: "))
print(search(residentes, target))
