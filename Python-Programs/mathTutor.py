"""
File: mathTutor.py
Description: Asks student for their name and grade, then gives them 5 problems
with difficulty based on their grade.
"""

from random import randint

PROBLEM_AMOUNT = 5

def main():
    #main
    username, grade = welcomeNameGrade()
    problemMin, problemMax = difficulty(grade)
    correctAmount = runTutor(grade,problemMin,problemMax,username,PROBLEM_AMOUNT)
    displayResults(correctAmount,PROBLEM_AMOUNT,username)

def welcomeNameGrade():
    #gets the users name and their grade level
    username = input("What is your name? ")
    grade = int(input("What is your grade? "))
    if grade == 1 or grade == 2 or grade == 3:
        return username,grade
    else:
        grade = int(input("Please enter your grade as 1, 2, or 3. "))
    

def difficulty(grade):
    #sets the difficulty of the problems based on the grade level of the user
    problemMin = 0
    problemMax = 0
    if grade == 1:
        problemMin = 0
        problemMax = 9
    if grade == 2:
        problemMin = 10
        problemMax = 99
    if grade == 3:
        problemMin = 100
        problemMax = 999
    return problemMin,problemMax

def runTutor(grade,problemMin,problemMax,username,PROBLEM_AMOUNT):
    #gives the user a problem until the number of problems they have done is equal or somehow exceeds the amount they should do based on "PROBLEM_AMOUNT".
    problemNumber = 1
    correctAmount = 0
    while problemNumber <= PROBLEM_AMOUNT:
        num1 = randint(problemMin,problemMax)
        num2 = randint(problemMin,problemMax)
        print("Problem #"+str(problemNumber)+":","  ",num1)
        print(" "*11,"+ ",num2)
        print(" "*12,"----")
        userAnswer = int(input("Answer:     "))
        correctAnswer = num1 + num2
        if userAnswer == correctAnswer:
            print("Great",username,", your answer is correct!!!")
            correctAmount += 1
        else:
            print("Sorry",username,", but your answer is incorrect. The correct answer is",correctAnswer,".")
        problemNumber += 1

    return correctAmount


def displayResults(correctAmount,PROBLEM_AMOUNT,username):
    #Displays the results of the problems.
    print("="*16," Summary ", "="*16)
    print("Bye "+str(username)+"!  You answered",correctAmount,"out of",PROBLEM_AMOUNT,"problems correct.")

main()
