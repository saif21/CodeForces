def badVersion(n):
    start = 1
    end = n
    while start < end:
        mid = (start+end)//2
        if not isBadVersion(mid):
            start = mid+1
        else:
            end = mid
    return start


def maxArea(height):
    max_area = 0
    left = 0
    right = len(height)-1
    while(left < right):
        max_area = max(max_area, min(height[left], height[right])*(right-left))
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1
    return max_area


print(maxArea([1, 6, 3, 2, 5, 8, 7, 4]))


def rescueBoats(people, limit):
    people.sort()
    l = 0
    boats = 0
    r = len(people)-1
    while(l <= r):
        if l == r:
            boats += 1
            break
        if people[l]+people[r] <= limit:
            l += 1
        r -= 1
        boats += 1
    return boats


print(rescueBoats([2, 3, 5, 3, 2, 5, 1], 5))
