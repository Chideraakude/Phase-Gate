import java.util.Scanner;

public class TaskFive{
    public static void main(String[]args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int celsius = inputCollector.nextInt();


        double faherient = (celsius * 1.8 + 32);

        System.out.println("The Conversion of Celsious to Faherient is: " + faherient);

    



    }



}
