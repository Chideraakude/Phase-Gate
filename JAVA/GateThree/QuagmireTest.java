


import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;




public class QuagmireTest{

    @Test
    public void testForNewArrayLength(){

        int[] input = {10, 11, 12};

        int actual = confusionArray.quagmireFunctions(input);
        int [] expected = {10, 11, 12, -1, -1};

        assertArrayEquals(expected, actual);









    }

        

    







}

