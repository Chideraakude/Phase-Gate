

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//

public class TaskTwoTest{


	@Test
	public void testThatLengthIsChecked(){
	
		int [] numbers = {5, -9, 3, -6, 2, -1};
		TaskTwo swapper = new TaskTwo();
		int expectedLength = swapper.getLength(numbers);
		int actualLength = 6;
		assertEquals(expectedLength, actualLength);
	}

	@Test
	public void testThatNegativeNumbersArereplacedWithZero(){
	
		int [] numbers = {5, -9, 3, -6, 2, -1};
		TaskTwo swapper = new TaskTwo();
        int [] expected = swapper.replaceNegativeNumberWithZero(numbers);
        int [] actual = {5, 0, 3, 0, 2, 0};
		assertEquals(expected, expected);
	}



}
