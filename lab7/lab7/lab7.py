
def main():
    side_length = int(input("Print a side length of a square: "))
    symbol = input("Print a filler symbol: ")

    # ����������� ������
    arr = []
    for i in range(1, side_length // 2 + 1):
        arr.append([' '] * i)
    for i in range(1, side_length // 2 + 1):
        arr.append([' '] * i)

    if side_length % 2 == 1:
        arr.append([' '] * (side_length // 2 + 1))

    # ���������� ������ ���������
    for i in range(len(arr)):
        arr[i] = [symbol] * len(arr[i])

    # ��������� �� �������
    for i in range(side_length):
        if i >= side_length // 2:
            print(' ' * (side_length // 2), end='')
        print(''.join(arr[i]))

    # ����� � ����
    with open("Result.txt", "w") as file:
        for i in range(side_length):
            if i >= side_length // 2:
                file.write(' ' * (side_length // 2))
            file.write(''.join(arr[i]) + '\n')

    print("The data was successfully saved in file.")

if __name__ == "__main__":
    main()

