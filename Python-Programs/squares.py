"""
Eli Frese

squares.py

Creates a latin square based off user inputs for size and start position

"""

order = int(input("Please input the order of square: "))

corner = int(input("Please input the top left number: "))

temp = 1

while corner >= order:
   corner = int(input("Please enter a value for the corner less than the order of the square: "))

print("The Latin square is:")

while temp <= order:
    for x in range(1, order + 1):
        if x < corner:
                continue
        print(x, end=" ")
    for y in range(1, corner):    
        if y > order:
                break
        print(y, end=" ")
    print()
    temp += 1
    corner += 1

    if corner > order:
        corner = 1
  
  


