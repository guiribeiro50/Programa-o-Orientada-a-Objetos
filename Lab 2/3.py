array = []
duplicates = []
count = 0
count_duplicates = 0


def search(array,count, target):
    for i in range(count):
        if array[i] == target:
            return "O nome existe."
    return "O nome não existe."

while count < 40:
    nome = str(input("Nome: "))
    if nome == "":
        break
    else:
        for i in range(count_duplicates):
            if nome == duplicates[i]:
                print("Nome já existe. Tente novamente!")
                break
        else:
            array += [nome]
            duplicates += [nome]
            count_duplicates += 1

            for i in range(count):
                min_index = i
                for j in range(i + 1, count + 1):
                    if array[j] < array[min_index]:
                        min_index = j
                array[i], array[min_index] = array[min_index], array[i]

            count += 1
target = str(input("Target: "))
print(array)
print(search(array,count,target))