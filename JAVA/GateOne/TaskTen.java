

import java.util.Scanner;

public class TaskTen{
    public static void main(String[]args){


        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int numberOne = inputCollector.nextInt();

        System.out.println("Enter a Number : ");
        int numberTwo = inputCollector.nextInt();

        System.out.println("Enter a Number : ");
        int numberThree = inputCollector.nextInt();

            int total = numberOne + numberTwo + numberThree;
            double average = total / 3;

        System.out.println("The average  of The Three Numbers Are: " + average);

    



    }



}
