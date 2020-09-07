#Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.


def descending_order(num):
    # Bust a move right here
    list_num = list(map(int, str(num)))
    list_num.sort(reverse=True)
    return int(''.join(map(str, list_num)))


print(descending_order(1234567))