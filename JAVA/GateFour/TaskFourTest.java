



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//

public class TaskFourTest{


	@Test
	public void testThatLengthIsChecked(){
	
		int [] numbers = {45, 60, 3, 0, 67, 2, 45, 3, 22, 0};
		TaskFour swapper = new TaskFour();
		int expectedLength = swapper.getLength(numbers);
		int actualLength = 10;
		assertEquals(expectedLength, actualLength);
	}

	@Test
	public void testThatNumberIsDuplicatedAndReturnIt(){
	
		int [] numbers = {45, 60, 3, 0, 67, 2, 45, 3, 22, 0};
		TaskFour swapper = new TaskFour();
        int [] expected = swapper.returnDuplicateNumbers(numbers);
        int [] actual = {45, 3, 0};
		assertEquals(expected, expected);
	}



}
