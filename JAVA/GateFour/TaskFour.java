
import java.util.Arrays;

public class TaskFour {

    public static void main(String[] args) {

        int[] numbers = {45, 60, 3, 0, 67, 2, 45, 3, 22, 0};
        System.out.println(Arrays.toString(returnDuplicateNumbers(numbers)));
    }


    public static int[] returnDuplicateNumbers(int[] numbers) {

        int[] arr = new int[numbers.length];
        int newIndex = 0;

        for (int count = 0; count < numbers.length; count++) {

            int current = numbers[count];
            int occurrences = 0;

            for (int counter = 0; counter < numbers.length; counter++) {
                if (numbers[counter] == current) {
                    occurrences++;
                }
            }


            if (occurrences == 2) {


                boolean alreadyAdded = false;
                for (int newCount = 0; newCount < newIndex; newCount++) {
                    if (arr[newCount] == current) {
                        alreadyAdded = true;
                        break;
                    }
                }

                if (!alreadyAdded) {
                    arr[newIndex] = current;
                    newIndex++;
                }
            }
        }


        int[] result = new int[newIndex];
        for (int counter = 0; counter < newIndex; counter++) {
            result[counter] = arr[counter];
        }

        return result;
    }
}
