
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//

public class TaskOneTest{


	@Test
	public void testThatLengthIsChecked(){
	
		int [] numbers = {5, 9, 3, 6, 2};
		TaskOne swapper = new TaskOne();
		int expectedLength = swapper.getLength(numbers);
		int actualLength = 5;
		assertEquals(expectedLength, actualLength);
	}

	@Test
	public void testThatNumberIsaPrimeNumber(){
	
		int [] numbers = {5, 9, 3, 6, 2};
		TaskOne swapper = new TaskOne();
        int [] expected = swapper.numberIsPrime(numbers);
        int [] actual = {5, 3};
		assertEquals(expected, expected);
	}



}
