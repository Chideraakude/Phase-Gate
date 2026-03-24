

def mini_parking_lot_system():
    chidera_collector = input

    parking_spaces = 20
    parking_slots = [0] * parking_spaces

    parking_lot_menu = """
    WELCOME - TO SEMICOLON PARKING LOT

    To Park Your Car - Press 1
    To Remove Your Car  - Press 2
    To Check Parking Lot Status - Press 3
    To Exit - Press 4
    """

    while True:
        print(parking_lot_menu)
        parking_choice = chidera_collector("")

        if parking_choice == "1":

            plate_number = int(input("Enter your plate number: "))
            parked = False

            for count in range(parking_spaces):
                if parking_slots[count] == 0:
                    parking_slots[count] = plate_number
                    print("Car parked at slot " + str(count))
                    parked = True
                    break

            if parked == False:
                print("Parking lot is full")

        if parking_choice == "2":
            plate_number = int(input("Enter your plate number: "))
            found = False

            for count in range(parking_spaces):
                if parking_slots[count] == plate_number:
                    parking_slots[count] = 0
                    print("Car removed at slot " + str(count))
                    print("Thank you for parking with us where your car saftey is our topmost priority")
                    found = True
                    break

            if found == False:
                print("Car not Found In This Parking Lot")



        if parking_choice == "3":

            for count in range(parking_spaces):
                if parking_slots[count] == 0:
                    print("Slot " + str(count) + " is Empty")
                else:
                    print("Slot " + str(count) + " has car " + str(parking_slots[count]))



        if parking_choice == "4":
            print("Goodbye Till When next We See You")
        break

        else:
            print("Invalid Input")


mini_parking_lot_system()
