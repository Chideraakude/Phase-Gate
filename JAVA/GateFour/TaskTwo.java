


import java.util.Arrays;

public class TaskTwo {

    public static void main(String[] args) {

        int[] numbers = {5, -9, 3, -6, 2, -1};
        System.out.println(Arrays.toString(replaceNegativeNumberWithZero(numbers)));
    }

    public static int[] replaceNegativeNumberWithZero(int[] numbers) {

        int[] arr = new int[numbers.length];

        for (int count = 0; count < numbers.length; count++) {

                if (numbers[count] < 0) {
                    arr[count] = 0;
                }

            else {
                arr[count] = numbers[count];
            }
        }

        return arr;
    }
    public int getLength(int[] numbers){
		return numbers.length;
	}
}
