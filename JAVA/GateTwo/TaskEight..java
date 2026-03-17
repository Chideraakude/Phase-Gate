import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;

        while (true) {
            System.out.print("Enter a Number: ");
            int userInput = input.nextInt();

            if (userInput == 0) {
                break;
            } else {
                total += userInput;
            }
        }

        System.out.println("Total: " + total);
    }
}
