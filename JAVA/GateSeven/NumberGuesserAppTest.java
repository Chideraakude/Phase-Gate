

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class NumberGuesserAppTest{

	@Test
	public void testThatNumberCanBeGuessed(){
      
         int userAttempt = NumberGuesserApp.guessANumberApp();

         assertTrue(userAttempt >= 0 && userAttempt <= 5);
	}



}

