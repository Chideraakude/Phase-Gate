import java.util.Scanner;

public class TaskTwelve{

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int number = input.nextInt();

        if(number < 0){

            System.out.println("This is an negative Number: " + number);
        }
        else{
            System.out.println("This is a positive Number: " + number);
        }


    }



}
