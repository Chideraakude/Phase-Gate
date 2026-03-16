

import java.util.Scanner;

public class TaskFourteen{

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int numberOne = input.nextInt();

    System.out.println("Enter another Number: ");
    int numberTwo = input.nextInt();

        if(numberOne > numberTwo){
            int largest = numberOne;

            System.out.println("This Largest Number Is: " + numberOne);
        }
        else{
            System.out.println("This Largest Number Is: " + numberTwo);
        }


    }



}
