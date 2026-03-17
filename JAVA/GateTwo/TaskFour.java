import java.util.Scanner;
public class TaskFour{

    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = input.nextInt();
    

        int number = 10;

        for(int count = 1; count <= number; count++){
           
            System.out.println(num + " " +  "X" + " " + count + " " + "= " + (num * count));


        }
        
    }

    

}
