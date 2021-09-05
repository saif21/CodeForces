def maximizeHeights(arr, n, k):
    arr.sort()  # sorting the array
    # it's same as substracting an+k-(ao+k) or an-k-(a0-k)
    ans = arr[n-1]-arr[0]
    small, big = 0, 0

    for i in range(1, n):  # trying to make each tower highest
        small = min(arr[0]+k, arr[i]-k)  # finding minimum tower height
        big = max(arr[i-1]+k, arr[-1]-k)  # finding maximum tower height
        # checking whether we get smaller value as result
        ans = min(ans, big-small)

    return ans


K = 5
N = 10
Arr = [2, 6, 3, 4, 7, 2, 10, 3, 2, 1]
print(maximizeHeights(Arr, N, K))
