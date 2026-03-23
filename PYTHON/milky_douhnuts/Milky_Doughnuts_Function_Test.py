

from unittest import TestCase
from function_class_milky_doughnuts import count_even, linear_search, perfect_square, array_equals, remove_duplicate


class Function_Test_Milky_Doughnuts(TestCase):

	def test_that_even_count(self):
		expected_result = 2
		actual_result = count_even([5, 2, 3, 4])

		self.assertEqual(expected_result, actual_result)

	def test_that_even_count_again(self):
		expected_result = 1
		actual_result = count_even([5, 2, 3, 7])

		self.assertEqual(expected_result, actual_result)



	def test_that_linear_search(self):
		expected_result = 2
		actual_result = linear_search([5, 2, 3, 4], 3)

		self.assertEqual(expected_result, actual_result)


	def test_that_linear_search_again(self):
		expected_result = 3
		actual_result = linear_search([5, 2, 3, 4], 4)

		self.assertEqual(expected_result, actual_result)


	def test_that_square(self):
		expected_result = [1,4,9]
		actual_result = perfect_square(3)

		self.assertEqual(expected_result, actual_result)


	def test_that_array_equals(self):
		expected_result = True
		actual_result = array_equals([1,4,9], [1,4,9])

		self.assertEqual(expected_result, actual_result)

	def test_that_array_equals_again(self):
		expected_result = False
		actual_result = array_equals([1,4,9], [1,3,9])

		self.assertEqual(expected_result, actual_result)


	def test_that_remove_duplicate(self):
		expected_result = ([1,4,9])
		actual_result = remove_duplicate([1,4,9,1,4,9])

		self.assertEqual(expected_result, actual_result)

	def test_that_remove_duplicate_again(self):
		expected_result = ([1,4,9,2])
		actual_result = remove_duplicate([1,4,9,2,2,1,4,9])

		self.assertEqual(expected_result, actual_result)










