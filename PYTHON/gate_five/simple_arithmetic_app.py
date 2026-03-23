#Psuedo code
#Step I: Import random
#Step II: 


import random

#def generate_random_number():
for number in range (1, 11):
    first_number = random.randint(100, 200)
    second_number = random.randint(1,100)

    random_result = first_number - second_number
        
    print(str(first_number) + "-" + str(second_number) + " " + "=" + " " + str(random_result))

    user_score = 0
    random_result = first_number - second_number
    user_input = 0

    while user_input < 10:
        user_input = int (input("Guess the answer: "))

        if user_input == random_result:
            user_score = user_score + 1
            print("Correct Answer " + str(random_result))
            break
        else:
            print("Incorrect Answer!!")
print("Your Total Score Is: " + str(user_score))

   
