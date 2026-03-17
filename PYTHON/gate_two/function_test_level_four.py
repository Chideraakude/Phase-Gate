
from unittest import TestCase;
from function_class_level_four import task_one


class function_test_level_four(TestCase):

    def test_the_sum_of_two_numbers(self):
        actual_number = function_test_level_four.task_one(2, 10)
        expected_number = 1

        self.assertEquals(actual_number,expected_number)

    

    


