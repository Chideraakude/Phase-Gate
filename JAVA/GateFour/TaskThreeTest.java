



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//

public class TaskThreeTest{


	@Test
	public void testThatLengthIsChecked(){
	
		int [] numbers = {5, 0, 3, 0, 2, 0};
		TaskThree swapper = new TaskThree();
		int expectedLength = swapper.getLength(numbers);
		int actualLength = 6;
		assertEquals(expectedLength, actualLength);
	}

	@Test
	public void testThatZeroIsMovedToTheEndOfTheArray(){
	
		int [] numbers = {5, 0, 3, 0, 2, 0};
		TaskThree swapper = new TaskThree();
        int [] expected = swapper.moveZeroToTheEndOfTheArray(numbers);
        int [] actual = {5, 3, 2, 0, 0, 0};
		assertEquals(expected, expected);
	}



}
