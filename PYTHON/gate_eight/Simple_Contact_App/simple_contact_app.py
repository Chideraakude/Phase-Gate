

contact_list = []
Doe
def main_menu():
    chidera_collector = input

    contact_main_menu = """
--- Contact App Main Menu ---

1. To Add Contact
2. To Remove Contact
3. To Find Contact By Phone Number
4. To Find Contact By First Name
5. To Find Contact By Last Name
6. To Edit and Update Contact
7. Exit
"""


    while True:
        print(contact_main_menu)
        usersChoice = chidera_collector("")



        if usersChoice == "1" :
            add_contact()
        elif usersChoice == "2":
            remove_contact()
    
        elif usersChoice == "3" :
            find_contact_by_phone_number()

        
        elif usersChoice == "4" :

            findContactByFirstName();
        
        elif usersChoice == "5" :
            findContactByLastName();
        
        elif usersChoice == "6":
            editContact();
        
        elif usersChoice == "7":

            break;
        
        else:
            print("Invalid Input!!")

def add_contact():

    first_name = input ("Enter your first name: ")
    last_name = input ("Enter your last name: ")
    phone_number = int (input("Enter your phone number: "))

    contact_list.appednd((first_name))
    contact_list.appednd((last_name))
    contact_list.appednd((phone_number))

    print ("Contact Added Successfully")



def remove_contact():

    phone_number = input("Enter a number to delete: ")

    for contact in contact_list:
        if add_contact.phone_number == phone_number:
            contact_list.remove((first_name))
            contact_list.remove((last_name))
            contact_list.remove((phone_number))

            print("Contact Removed Successfully")
            return

        else:
            print("Contact Not Found!!")


def find_contact_by_phone_number():

    phone_number = input("Enter a phone number: ")

    for contact in contact_list:
        if contact["phone"] == phone_number:
            contact_list.remove(contact)

            print(contact ["first_name"], contact["last_name"], contact["phone_number"])
            return

main_menu()




































            
