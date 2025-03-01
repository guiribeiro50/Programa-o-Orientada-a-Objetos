array = [[0] * 5 for i in range(4)]


def insert_data(matrix):
    for i in range(4):
        for j in range(5):
            valor = int(input(f'Peças na Linha {i + 1} e no {j + 1}º dia da semana: '))
            matrix[i][j] = valor
    return matrix


def sum_semana(matrix):
    for j in range(5):
        sum = 0
        for i in range(4):
            sum += matrix[i][j]
        print(f'Nº de peças no {j + 1}º da semana: {sum}')
    return ""


def sum_linha(matrix):
    for i in range(4):
        sum = 0
        for j in range(5):
            sum += matrix[i][j]
        print(f'Nº de peças na {i + 1}ª linha: {sum}')
    return ""


def medio_semana(matrix):
    for j in range(5):
        sum = 0
        media = 0
        for i in range(4):
            sum += matrix[i][j]
        media = sum / 5
        print(f'Nº médio de peças no {j + 1}º da semana: {media}')
    return ""


def medio_linha(matrix):
    for i in range(4):
        sum = 0
        media = 0
        for j in range(5):
            sum += matrix[i][j]
        media = sum / 5
        print(f'Nº médio de peças na {i + 1}º linha: {media}')
    return ""


def mais_pecas(matrix):
    max_value = 0
    linha = 0
    for i in range(4):
        sum = 0
        for j in range(5):
            sum += matrix[i][j]
        if sum > max_value:
            max_value = sum
            linha = i + 1
    return linha


matrix = insert_data(array)
print(matrix)
sum_semana(matrix)
sum_linha(matrix)
medio_semana(matrix)
medio_linha(matrix)
linha = mais_pecas(matrix)
print(f'A linha que mais produz peças defeituosas é a {linha}ª linha')