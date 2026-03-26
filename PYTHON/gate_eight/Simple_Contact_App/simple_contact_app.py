
contact_list = []
def main_menu():

    chidera_collector = input

    contact_main_menu = """
    \n--- Contact App Main Menu ---

    1. To Add Contact
    2. To Remove Contact
    3. To Find Contact By Phone Number
    4. To Find Contact By First Name
    5. To Find Contact By Last Name
    6. To Edit and Update Contact
    7. Exit
    """


while(True):
    print(contact_main_menu)
    userChoice = chidera_collector("")



    if usersChoice == "1" :
            add_contact(first_name, last_name, phone_number)


main_menu()


def add_contact(first_name, last_name, phone_number):

    first_name = input ("Enter your first name: ")
    last_name = input ("Enter your last name: ")
    phone_number = int (input("Enter your phone number: "))

    contact_list.appednd((first_name))
    contact_list.appednd((last_name))
    contact_list.appednd((phone_number))

    print ("Contact Added Successfully")

add_contact()

































            
