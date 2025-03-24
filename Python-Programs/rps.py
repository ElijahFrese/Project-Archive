"""
rps.py

Eli Frese

allows user to play rock paper scissors with the computer
"""
import random

move_list = ["r","R","s","S","p","P","q"]

keepgoing=True

tie = 0
win = 0
loss = 0
total = 0

while keepgoing == True:
    move_user = input("Please enter your weapon choice:  ")

    while move_user not in move_list:
        
        move_user = input("Please enter a valid weapon choice:  ")

    picked = random.choice(["r","p","s"])

    if picked == "r":
        if move_user == "r" or move_user == "R":
            print("TIE. Both picked r")
            tie += 1
        elif move_user == "p" or move_user == "P":
            print("HUMAN WINS. Human pick:", move_user,"Computer pick:", picked)
            win += 1
        elif move_user == "s" or move_user == "S":
            print("COMPUTER WINS. Human pick:", move_user,"Computer pick:", picked)
            loss += 1

    elif picked == "p":
        if move_user == "p" or move_user == "P":
            print("TIE. Both picked p")
            tie += 1
        elif move_user == "s" or move_user == "S":
            print("HUMAN WINS. Human pick:", move_user,"Computer pick:", picked)
            win += 1
        elif move_user == "r" or move_user == "R":
            print("COMPUTER WINS. Human pick:", move_user,"Computer pick:", picked)
            loss += 1

    elif picked == "s":
        if move_user == "s" or move_user == "S":
            print("TIE. Both picked s")
            tie += 1
        elif move_user == "r" or move_user == "R":
            print("HUMAN WINS. Human pick:", move_user,"Computer pick:", picked)
            win += 1
        elif move_user == "p" or move_user == "P":
            print("COMPUTER WINS. Human pick:", move_user,"Computer pick:", picked)
            loss += 1

    if move_user == "q":
        keepgoing = False
        print("Thanks for playing.")
        print("We played a total of", total, "rounds.")
        print("Total ties:", tie)
        print("Total wins for human:", win)
        print("Total wins for computer:", loss)
    if move_user != "q":
        total += 1




# != "r" or move_user != "R" or move_user != "p" or move_user != "P" or move_user != "s" or move_user != "S" or move_user != "q":
    
            
        
