
def task_one():
    numberOne = 2
    numberTwo = 10

    total = numberOne + numberTwo
    return total

task_one()

def even_number():

    for number in range(2):

        if number % 2 == 0:

            print("Number is Even")


even_number()

def square_of_number():

    
    numberTwo = 10

    squareOfNumber = (numberTwo ** 2)

    print(squareOfNumber)


square_of_number()


def convert_celsius_to_fa():

    celsius = 10

    faherient = (celsius * 1.8  + 32)

    print(faherient)


convert_celsius_to_fa()

def number_is_prime():

    for number in range(2, 50):

        divisor = 0
    
    for count in range(1, number + 1):

        if number % count == 0:
            divisor += 1

            if divisor == 2:
                print(str(number) + " " + "Number is a Prime Number")


number_is_prime()




def largest_number():

    numberOne = 10
    numberTwo = 20
    numberThree = 5

    if numberOne > numberTwo and numberOne > numberThree:
        largest = numberOne
        print("Largest Is:", largest)

    elif numberTwo > numberOne and numberTwo > numberThree:
        largest = numberTwo
        print("Largest Is:", largest)

    else:
        largest = numberThree
        print("Largest Is:", largest)


largest_number()


def simple_interest():

    principal = 10
    rate = 20
    time = 5

    simple_interest = (principal * rate * time) / 100

print("Simple Interest Is:", simple_interest)


simple_interest()



def multiplication_table():

    numbers = 5

    for number in range(1,11):
           
        print(str(numbers) + " " +  "X" + " " + str(number) + " " + "= " + str(numbers * number));



multiplication_table()



def area_of_rectangle():

    length = 5
    breadth = 7

    area_of_rectangles = length * breadth
           
    print(area_of_rectangles);



area_of_rectangle()


def reverse_number():

    length = 5
    breadth = 7

    area_of_rectangles = length * breadth
           
    print(area_of_rectangles);



reverse_number()






















