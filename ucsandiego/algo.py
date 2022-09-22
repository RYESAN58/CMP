x = []


def nine_one_two_seven():
    for i in range(10000):
        if i * 9127 > 1000000:
            return x
        elif i * 9127 > 100000 and i * 9127 < 101000:
            x.append(i*9127)


print(nine_one_two_seven())