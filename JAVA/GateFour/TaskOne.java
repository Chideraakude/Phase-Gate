import java.util.Arrays;

public class NumberIsPrime {

    public static void main(String[] args) {

        int[] numbers = {5, 9, 3, 6, 2};
        System.out.println(Arrays.toString(numberIsPrime(numbers)));
    }

    public static int[] numberIsPrime(int[] numbers) {

        int[] arr = new int[numbers.length];
        int index = 0;

        for (int count = 0; count < numbers.length; count++) {

            int divisor = 0;

            for (int counter = 1; counter <= numbers[count]; counter++) {

                if (numbers[count] % counter == 0) {
                    divisor++;
                }
            }

            if (divisor == 2) {
                arr[index] = numbers[count];
                index++;
            }
        }

        int[] result = new int[index];
        for (int count = 0; count < index; count++) {
            result[count] = arr[count];
        }

        return result;
    }
}
