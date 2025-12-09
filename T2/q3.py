def rotabc(str):
    newStr = []
    for c in str:
        if c == 'a':
            newStr.append('b')
        elif c == 'b':
            newStr.append('c')
        elif c == 'c':
            newStr.append('a')
        else:
            newStr.append(c)
    return "".join(newStr)

def main():
    str = input("enter string: ")
    print("rotabc: ")
    print(rotabc(str))

if __name__ == "__main__":
    main()