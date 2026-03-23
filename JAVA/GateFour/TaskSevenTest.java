
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//

public class TaskSevenTest{


	@Test
	public void testThatLengthIsChecked(){
	
		int [] numbers = {4, 7, 9, 10, 16, 18};
		TaskSeven swapper = new TaskSeven();
		int expectedLength = swapper.getLength(numbers);
		int actualLength = 6;
		assertEquals(expectedLength, actualLength);
	}

	@Test
	public void testThatNumberIsaPerfectSquare(){
	
		int [] numbers = {4, 7, 9, 10, 16, 18};
		TaskSeven swapper = new TaskSeven();
        int [] expected = swapper.perfectSquare(numbers);
        int [] actual = {4, 9, 16};
		assertEquals(expected, expected);
	}



}
