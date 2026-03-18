import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfArraysTest{

    @Test
    	public void testThatLengthOfString(){
	
		String userInput = "AaaBBc";
		ArrayOfArrays lowerAndUpperCase = new ArrayOfArrays();
		int [] expectedLength = lowerAndUpperCase.arrayOfStrings(userInput);
		int [] actualLength = {1, 2, 2, 1};
		assertEquals(expectedLength, actualLength);
	}

      @Test
        public void testThatLengthIsChecked() {

        double[][] numbers = {
                {45.2, 90.28, 77.1},
                {3.52, 9.86, 11.77},
                {7.7, 10, 22.33, 12}
        };

        ArrayOfArrays swapper = new ArrayOfArrays();

        int actual = swapper.getLength(numbers);
        int expected = 3;

        assertEquals(expected, actual);
    }



}
