from math import prod


x = []

#find a 6 digit number who's first 3 digits are 100 and is divisable by 9127
def nine_one_two_seven():
    for i in range(10000):
        if i * 9127 > 1000000:
            return x
        elif i * 9127 > 100000 and i * 9127 < 101000:
            x.append(i*9127)

print(nine_one_two_seven())


# find a number where if divided by 2,3,4,5,6,7 it will have 1 as the remainder
def product():
    x = []
    for i in range(99,1000):
      if i%2 == 1 and i%3 == 1 and i%4 == 1 and i%5 == 1 and i%6 == 1 and i%7 == 1:
          x.append(i)
    return x

print(product())

# find a number where when its squared the first 5 digits = 31415

def squared():
    x=[]
    for i in range(1300, 2000):
        print(f"{i} times {i} == ", i*i)


squared()