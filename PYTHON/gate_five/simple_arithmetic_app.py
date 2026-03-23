#Psuedo code
#Step I: Import random
#Step II: Create a loop of numbers between one and ten
#Step III: Initialize first and second number to a random number between 100 and 200 and 1 and 100 respectively
#Step IV: initialize your random result to the calculation of te first number minus the second number then print the result


import random


for number in range (1, 11):
    first_number = random.randint(100, 200)
    second_number = random.randint(1,100)

    random_result = first_number - second_number
        
    print(str(first_number) + "-" + str(second_number) + " " + "=" + " " + str(random_result))

    attempt = 0
    user_score = 0
    random_result = first_number - second_number
    user_input = 0

    while user_input < 10:
        user_input = int (input("Guess the answer: "))

        if user_input == random_result:
            user_score += 1
            print("Correct Answer " + str(random_result))
            break
        else:
            print("Incorrect Answer!!")
            user_input = int (input("Guess the answer: "))
            if user_input == random_result:
                attempt += 1
            
print("Your Total Score Is: " + str(user_score))

   
