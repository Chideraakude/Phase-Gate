





import java.util.Arrays;

public class TaskThree {

    public static void main(String[] args) {

        int[] numbers = {5, 0, 3, 0, 2, 0};
        System.out.println(Arrays.toString(replaceNegativeNumberWithZero(numbers)));
    }

    public static int[] replaceNegativeNumberWithZero(int[] numbers) {

        int tempOne = numbers [1];
        int tempTwo = numbers [1];
        int newIndex = 0;

        int[] arr = new int[numbers.length];

        for (int count = 0; count < numbers.length -1; count++) {
            if (count != 1 && count != 3){
                arr[newIndex] = numbers[count];
                newIndex++;


            }
//            numbers[count] = numbers [count + 1];

        }
        arr[newIndex] = tempOne;
        arr[newIndex + 1] = tempTwo;

        return arr;
    }
}
