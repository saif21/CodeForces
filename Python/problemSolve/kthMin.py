# def kthmin(arr, k):
#     return arr.sort()[k-1]


# print(kthmin([2, 3, 5, 9, 7, 1], 3))
# arr = [3, 8, 28, 23, 2, 5]
# print()
def heaping(arr, n, k):
    greatest = k
    left = 2*k+1
    right = 2*k+2

    if left < n and arr[k] < arr[left]:
        greatest = left

    if right < n and arr[greatest] < arr[right]:
        greatest = right

    if greatest != k:
        arr[greatest], arr[k] = arr[k], arr[greatest]


def max_heap(arr, n):
    for i in range(n, -1, -1):
        heaping(arr, n, i)

    for num in range(n-1, -1, -1):
        arr[num], arr[0] = arr[0], arr[num]
        heaping(arr, num, 0)


# Driver code
array = [12, 11, 13, 5, 6, 7]
n = len(array)
max_heap(array, n)
k = 3
# for kth smallest child
print(array[k-1])
# for kth greatest child
print(array[-k])

# Python program for getting a kth smallest/largest value from the unsorted array
# def heaping(array, n, k):
#     # let the greatest element be at index k
#     # so k will be the root element
#     greatest = k
#     # for left hand branching
#     left = 2*k + 1
#     # for right hand branching
#     right = 2*k + 2

#     # if left child of the root is greater than the root
#     # then change root to left child
#     if left < n and array[k] < array[left]:
#         greatest = left

#     # if right child of the root is greater than the root
#     # change root to right child
#     if right < n and array[greatest] < array[right]:
#         greatest = right

#     # if the value of root is less than the value at kth index
#     # swap them
#     if greatest != k:
#         # swap between two element
#         array[greatest], array[k] = array[k], array[greatest]

# # Sort the given array of size n


# def max_heap(array, n):

#     # max heap
#     for i in range(n, -1, -1):
#         heaping(array, n, i)

#     for num in range(n-1, -1, -1):
#         # swap between two element
#         array[num], array[0] = array[0], array[num]
#         heaping(array, num, 0)


# # Driver code
# array = [12, 11, 13, 5, 6, 7]
# n = len(array)
# max_heap(array, n)
# k = 3
# # for kth smallest child
# print(array[k-1])
# # for kth greatest child
# print(array[-k])
