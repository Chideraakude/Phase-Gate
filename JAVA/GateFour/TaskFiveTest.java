



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;


public class TaskFiveTest{


	@Test
	public void testThatLengthIsChecked(){
	
		int [] numbers = {45, 60, 3, 10, 9, 22};
		TaskFive swapper = new TaskFive();
		int expectedLength = swapper.getLength(numbers);
		int actualLength = 6;
		assertEquals(expectedLength, actualLength);
	}

	@Test
	public void testThatLengthIsEvenOrOdd(){
	
		int [] numbers = {45, 60, 3, 10, 9, 22};
		TaskFive swapper = new TaskFive();
		int [][]actual = swapper.evenArrayAndOddArray(numbers);
        int [] []expected = {
                    {45,3,9}, {60,10,22}
        };
		assertTrue(Arrays.deepEquals(expected, actual));
	}

}
