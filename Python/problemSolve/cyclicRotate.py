def cyclicRotate(arr, n):
    last = arr[n-1]
    for i in range(n-1, 0, -1):
        arr[i] = arr[i-1]
    arr[0] = last
    return arr


arr = [1, 2, 3, 4, 5, 2, 5]
print(cyclicRotate(arr, len(arr)))
