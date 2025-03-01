def search(array, i, target):
    for index in range(i):
        if array[index] == target:
            return "O nome existe."
    return "O nome não existe."


i = 1
array = []

while i < 20:
    nome = str(input("Nome: "))
    if nome == "":
        break
    else:
        array += [""]
        array[i] = nome
        i += 1
target = str(input("Target: "))
print(array)
print(search(array, i, target))