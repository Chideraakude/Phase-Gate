
import java.util.Arrays;



public class Quagmire{

    public static void main(String[]args){

    int [] numbers = {10, 11, 12};
     System.out.println(Arrays.toString(quagmireFunctions(numbers)));





    }



    public static int [] quagmireFunctions(int [] numbers){

        int [] arr = new int [numbers.length + 2];
        for(int count = 0; count < numbers.length; count++){
            arr[count] = numbers[count];
            arr[count + numbers.length] = numbers[count] + 2;


        }

        return arr;

    





    }





}
