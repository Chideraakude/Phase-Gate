def count_even(numbers):
	count = 0

	for num in numbers:
		if num % 2 == 0:
			count += 1

	return count



def linear_search(numbers, target):
	for index in range(len(numbers)):
		if numbers[index] == target:
			return index

	return -1


def perfect_square(numbers):
	result = []

	for index in range(1, numbers+1):
		result.append(index*index)
	return result


def array_equals(numbers, num):
	if len(numbers) != len(num):
		return False

	for index in range(len(numbers)):
		if numbers[index] != num[index]:
			return False

	return True

def remove_duplicate(numbers):

	result = []

	for index in numbers:
		if index not in result:
			result.append(index)

	return result
