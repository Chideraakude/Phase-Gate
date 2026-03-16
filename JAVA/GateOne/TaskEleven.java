import java.util.Scanner;

public class TaskEleven{

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int number = input.nextInt();

        if(number % 2 == 0){

            System.out.println("This is an Even Number: " + number);
        }
        else{
            System.out.println("This is an Odd Number: " + number);
        }


    }



}
