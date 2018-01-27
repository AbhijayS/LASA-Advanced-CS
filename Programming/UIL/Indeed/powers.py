for i in range(1000, 9999):
    a = str(i)
    first = int(a[3])**7
    second = int(a[2])**7
    third = int(a[1])**7
    fourth = int(a[0])**7
    num = first + second + third + fourth
    #print(oct(num))
    if(num == oct(num)[2:]):
        print(num)
print("Done")
