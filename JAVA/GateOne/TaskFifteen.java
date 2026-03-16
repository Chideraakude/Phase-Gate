
import java.util.Scanner;

public class TaskFifteen{

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int numberOne = input.nextInt();

    System.out.println("Enter another Number: ");
    int numberTwo = input.nextInt();

    System.out.println("Enter another Number: ");
    int numberThree = input.nextInt();

        if(numberOne > numberTwo && numberOne > numberThree){
            int largest = numberOne;

            System.out.println("This Largest Number Is: " + numberOne);
        }
        else if (numberTwo > numberOne && numberTwo > numberThree){
                int largest = numberTwo;
            System.out.println("This Largest Number Is: " + numberTwo);
        }else if( numberThree > numberOne && numberThree > numberTwo){
                int largest = numberThree;
            System.out.println("This Largest Number Is: " + numberTwo);
        }


    }



}
