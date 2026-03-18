import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;




public class QuagmireTest {

    @Test
    public void testForNewArrayLength(){

        int[] input = {10, 11, 12};

        int[] actual = Quagmire.quagmireFunctions(input);

        int[] expected = {10, 11, 12, -1, -1};

        assertArrayEquals(expected, actual);
    }
}
