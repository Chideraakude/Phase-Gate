
import java.util.Arrays;

public class TaskFive{

    public static void main(String[]args){
    int [] numbers = {45, 60, 3, 10, 9, 22};
    System.out.println(Arrays.deepToString(evenArrayAndOddArray(numbers)));



    }


    public static int [] [] evenArrayAndOddArray(int []numbers){

        int[] odd = new int[numbers.length];
        int[] even = new int[numbers.length];

        int oddIndex = 0;
        int evenIndex = 0;


        for (int count = 0; count < numbers.length; count++){
            if (numbers[count] % 2 == 0){
                even[evenIndex] = numbers[count];
                evenIndex++;
            
            }
            else{
            
                odd[oddIndex] = numbers[count];
                oddIndex++;
            }

        }
        
        int[] oddResult = new int[oddIndex];
        int[] evenResult = new int[evenIndex];

        for(int counter = 0; counter < oddIndex; counter++){
            oddResult[counter] = odd[counter];

        }
        for(int counter = 0; counter < evenIndex; counter++){
            evenResult[counter] = even[counter];

        }

        return new int [][]{oddResult, evenResult};
        





    }
    public int getLength(int[] numbers){
		return numbers.length;
	}

}
