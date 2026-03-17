

import java.util.Scanner;
public class TwentyTwo{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    
    for (int count = 1; count <= 5; count++){
        
        int total = 0;
        System.out.println("Enter a Number: ");
        int numbers = input.nextInt();

        total += count;

        System.out.println("The Total Is: " + total);


    }
    

        
    }

}




//for number in range(1, 6):
//    numbers = int(input("Enter a Number: "))
//    numbers += number
//           
//    print(numbers);
