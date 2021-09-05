def pascalsTriangle(n):
    new_list = []
    for i in range(n):
        temp_list = []
        for j in range(i+1):
            if j == 0 or j == i:
                temp_list.append(1)
            else:
                temp_list.append(new_list[i-1][j]+new_list[i-1][j-1])
        new_list.append(temp_list)
    return new_list


print(pascalsTriangle(5))


def pascals(n):
    ex = [1]
    out = []
    now = []
    for i in range(n):
        for j in range(i+1):
            if j == i or j == 0:
                now.append(1)
            else:
                now.append(ex[j-1] + ex[j])
        out.append(now)
        ex = [n for n in now]
        now = []
    return out


numsP = pascalsTriangle(15)
n = 15

for i in range(n):
    for j in range(n-i-1):
        print(format(' ', '<2'), end='')
    for j in range(i+1):
        print(format(numsP[i][j], '<4'), end=' ')
    print()


def getRow(rowIndex):
    list1 = []
    for i in range(rowIndex+1):
        temp = []
        for j in range(i+1):
            if j == 0 or j == i:
                temp.append(1)
            else:
                temp.append(list1[i-1][j]+list1[i-1][j-1])
        list1.append(temp)
    return list1[-1]
