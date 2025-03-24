"""
Eli Frese

countVowels.py

counts the vowels in a string entered

"""
text = input("Enter the text you would like me to analyze ")

char_A = 0

char_E = 0

char_I = 0

char_O = 0

char_U = 0

for letter in text:
    if letter == "a" or letter == "A":
        char_A += 1
    elif letter == "e" or letter == "E":
        char_E += 1
    elif letter == 'i' or letter == 'I':
        char_I += 1
    elif letter == 'o' or letter == 'O':
        char_O += 1
    elif letter == 'u' or letter == 'U':
        char_U += 1
    else:
        continue
print("There were {} 'a's".format(char_A))
print("There were {} 'e's".format(char_E))
print("There were {} 'i's".format(char_I))
print("There were {} 'o's".format(char_O))
print("There were {} 'u's".format(char_U))
