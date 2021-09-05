import random


def password(d):
    mid = len(d)//2
    largest = max(d)
    minimum = min(d)
    passd = [0 for x in range(len(d))]
    passd[mid-1] = largest
    passd[0] = minimum
    di = {}
    for i in d:
        if i not in d:
            di[i] = 1
        di[i] += 1
    for k, v in di.items():
        if k in passd:
            continue
        elif k not in passd:
            passd[1] = k
            di[k] -= 1


print(password([1, 2, 3, 4, 5]))
