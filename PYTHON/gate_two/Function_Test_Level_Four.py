
from unittest import TestCase
from function_class_level_four import task_one, even_number, square_of_number, convert_celsius_to_fa, number_is_prime, largest_number, simple_interest, multiplication_table, area_of_rectangle, reverse_number


class Function_Test(TestCase):

    def test_the_sum_of_two_numbers(self):
        actual_number = task_one()
        expected_number = 12

        self.assertEqual(actual_number, expected_number)

    

class Function_Tester(TestCase):

    def test_that_number_is_even(self):

        actual_number = even_number()
        expected_number = 2

        self.assertNotEqual(actual_number, expected_number)

    


class Function_Tested(TestCase):

    def test_that_number_is_squared(self):

        actual_number = square_of_number()
        expected_number = 100

        self.assertNotEqual(actual_number, expected_number)
    



class Function_Tests(TestCase):

    def test_that_number_is_converted_to_faherient(self):

        actual_number = convert_celsius_to_fa()
        expected_number = 50

        self.assertNotEqual(actual_number, expected_number)


class Function_Test_Prime(TestCase):

    def test_that_number_is_Prime(self):

        actual_number = number_is_prime()
        expected_number = 49

        self.assertNotEqual(actual_number, expected_number)


class Function_Test_Largest(TestCase):

    def test_that_number_is_largest(self):

        actual_number = largest_number()
        expected_number = 20

        self.assertNotEqual(actual_number, expected_number)


class Function_Test_Simple_Interest(TestCase):

    def test_that_number_is_has_interest(self):

        actual_number = simple_interest()
        expected_number = 1

        self.assertNotEqual(actual_number, expected_number)




class Function_Test_Simple_Multiplication(TestCase):

    def test_that_number_is_multiplied(self):

        actual_number = multiplication_table()
        expected_number = 50

        self.assertNotEqual(actual_number, expected_number)


class Function_Test_Simple_Area(TestCase):

    def test_that_area_is_Calculated(self):

        actual_number = area_of_rectangle()
        expected_number = 50

        self.assertNotEqual(actual_number, expected_number)


class Function_Test_Is_Reversed(TestCase):

    def test_that_area_is_Calculated(self):

        actual_number = reverse_number()
        expected_number = 50

        self.assertNotEqual(actual_number, expected_number)










