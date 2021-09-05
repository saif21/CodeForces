def StringTask(s):
    vowels = ["a", 'e', 'i', 'o', 'u', 'y']
    l = list(s.lower())
    print(l)
    for i in range(len(l)):
        if l[i] in vowels:
            l[i] = ''
    ns = ""
    for j in l:
        if j:
            ns += f".{j}"
    another = "".join("."+char.lower()
                      for char in s if char.lower() not in "aeiouy")
    return ns, another


s = input()
print(StringTask(s))
