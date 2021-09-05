def binarySearch(lis, target):
    lis = sorted(lis)
    left = 0
    right = len(lis)
    while left <= right:
        mid = (left+right)//2
        if lis[mid] == target:
            return mid
        elif lis[mid] < target:
            left = mid+1
        else:
            right = mid-1
    return -1


lis = [3, 5, 9, 38, 31, 35, 2, 33]
print(binarySearch(lis, 0))

# Move "0" to the left


def moveZeroLeft(lis):
    j = 0
    for num in lis:
        if num != 0:
            lis[j] = num
            j += 1
    for x in range(j, len(lis)):
        lis[x] = 0
    return lis


l = [0, 3, 5, 0, 3, 23, 0, 4]
print(moveZeroLeft(l))


def validMountain(lis):
    if len(lis) < 3:
        return False
    i = 1
    while i < len(lis) and lis[i] > lis[i-1]:
        i += 1
    if i == 1 or i == len(lis):
        return False
    while i < len(lis) and lis[i] < lis[i-1]:
        i += 1
    return i == len(lis)


l = [0, 2, 1, 5, 6, 4, 9]
print(validMountain(l))

# binary serach using recursive function


def binSearch(key, lis, l, r):
    if l > r:
        return False
    else:
        m = (l+r)//2
        if lis[m] == key:
            return m
        elif key < lis[m]:
            return binSearch(key, lis, l, m-1)
        else:
            return binSearch(key, lis, m+1, r)


a = [2, 3, 5, 6, 8, 9]
b = 5
l = 0
r = len(a)
print(binSearch(b, a, l, r))
