def boyOrGirl(s):
    dist = []
    for i in s:
        if i not in dist:
            dist.append(i)
    if len(dist) % 2 != 0:
        return "IGNORE HIM!"
    return "CHAT WITH HER!"


s = input()
print(boyOrGirl(s))
