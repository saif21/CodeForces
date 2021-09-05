d = {
    "a": 1,
    "b": 2,
    "c": 3,
    "d": 4,
    "e": 5,
    "f": 6,
    "g": 7,
    "h": 8,
    "i": 9,
    "j": 10,
    "k": 11,
    "l": 12,
    "m": 13,
    "n": 14,
    "o": 15,
    "p": 16,
    "q": 17,
    "r": 18,
    "s": 19,
    "t": 20,
    "u": 21,
    "v": 22,
    "w": 23,
    "x": 24,
    "y": 25,
    "z": 26
}


def petya(x, y):
    x_sum = 0
    y_sum = 0
    for i in x:
        x_sum += d[i]
    for j in y:
        y_sum += d[j]

    if(x_sum == y_sum):
        return 0
    elif(x_sum > y_sum):
        return 1
    else:
        return -1


if __name__ == '__main__':
    x = input()
    y = input()
    print(petya(x.lower(), y.lower()))


def compare(str1, str2):

    for i in range(0, len(str1)):
        if(str1.lower()[i] < str2.lower()[i]):
            return -1
        elif(str1.lower()[i] > str2.lower()[i]):
            return 1
    return 0


if __name__ == "__main__":
    str1 = input()
    str2 = input()

    print(compare(str1, str2))
