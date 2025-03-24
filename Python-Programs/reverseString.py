"""
Eli Frese

reverseString.py

prints the reverse of a string entered by the user

"""

text = input("Enter a string. ")

output = ""

length = len(text)

for index in range(1, length+1):
    char = text[-index]
    output = output + char

print("original -",text)
print("reversed -",output)
