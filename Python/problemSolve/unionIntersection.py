def union(arr1, arr2, n, m):
    i, j = 0, 0
    unionArr = []
    while i < n and j < m:
        if arr1[i] < arr2[j]:
            unionArr.append(arr1[i])
            i += 1
        elif arr2[j] < arr1[i]:
            unionArr.append(arr2[j])
            j += 1

        else:
            unionArr.append(arr2[j])
            i += 1
            j += 1
    while i < n:
        unionArr.append(arr1[i])
        i += 1
    while j < m:
        unionArr.append(arr2[j])
        j += 1
    return unionArr


def intersection(arr1, arr2, n, m):
    i, j = 0, 0
    intersectionArr = []
    while i < n and j < m:

        if arr1[i] < arr2[j]:
            i += 1
        elif arr2[j] < arr1[i]:
            j += 1
        else:
            intersectionArr.append(arr2[j])
            i += 1
            j += 1
    return intersectionArr


# Driver program to test above function
arr1 = [1, 2, 4, 5, 6]
arr2 = [2, 3, 5, 7]
m = len(arr1)
n = len(arr2)
print(union(arr1, arr2, m, n))
print(intersection(arr1, arr2, m, n))
