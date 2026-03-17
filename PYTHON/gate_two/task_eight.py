total = 0

while True:
    user_Input = int(input("Enter a Number: "))
    
    if user_Input == 0:
        break
    else:
        total += user_Input

print(total)
