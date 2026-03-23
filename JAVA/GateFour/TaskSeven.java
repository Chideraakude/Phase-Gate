import java.util.Arrays;

public class TaskSeven {

    public static void main(String[] args) {

        int[] numbers = {4, 7, 9, 10, 16, 18};
        System.out.println(Arrays.toString(perfectSquare(numbers)));
    }


    public static int[] perfectSquare(int[] numbers) {

        int[] result = new int[numbers.length];
        int index = 0;

        for (int count = 0; count < numbers.length; count++) {
            int num = numbers[count];

            int squareRoot = (int) Math.sqrt(num);

            if (squareRoot * squareRoot == num){
                result[index] = num;
                index++;
        
            }
        }
        int [] finalResult = new int[index];
        for (int counter = 0; counter < index; counter++){
            finalResult[counter] = result[counter];
        }

        return finalResult;
    }
    public int getLength(int[] numbers){
		return numbers.length;
	}

}
