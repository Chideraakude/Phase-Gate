import java.util.Scanner;
public class TaskFour{
    public static void main(String[]args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int number = inputCollector.nextInt();

    System.out.println("Enter another Number : ");
    int numberTwo = inputCollector.nextInt();

        int productOfNumbers = number * numberTwo;

        System.out.println("The Product of the numbers are: " + productOfNumbers);

    



    }



}
