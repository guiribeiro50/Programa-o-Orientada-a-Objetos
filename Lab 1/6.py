vetor = []
vetor2 = []

n = int(input("Número de elementos: "))
for i in range(n):
    num = int(input("Número:"))
    vetor.append(num)
    if (i + 1) % 2 == 0:
        vetor2.append(num * 2)
    else:
        vetor2.append(num * 3)
print(vetor)
print(vetor2)