



word = "Jolly Man Loves Women"
noWord = ""
thirdWord = "This word has four +1"
def vowelFinder(letters):
    x = 0
    for i in letters:
        
        if(i == "a" or i == "e" or i == "i" or i == "o" or i == "u" or i == "A"):
            x += 1
    return x

print(vowelFinder(word))
print(vowelFinder(noWord))
print(vowelFinder(word))
print(vowelFinder(thirdWord))


