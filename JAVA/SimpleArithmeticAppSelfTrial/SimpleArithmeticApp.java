

import java.util.Scanner;
import java.util.Random;
import java.time.LocalTime;

public class SimpleArithmeticApp{

    public static void main (String [] args){
     

    Random random = new Random();
    LocalTime mytime = LocalTime.now();

    int userScore = 0;
    

    int counter = 0;

    while (counter < 10){
        int userInput = 10;
        while (true){
            int firstNumber = (int) (Math.random() * 10);
            int secondNumber = (int)(Math.random() * 10);
            int difference = (firstNumber > secondNumber) ? (firstNumber - secondNumber) : (secondNumber - firstNumber);


                System.out.println(firstNumber + "-" + secondNumber + " " + "=" + " " + "?");

            
            int userAttempt = 0;
            Scanner input = new Scanner (System.in);
            System.out.println("Guess The Answer: ");
            userInput = input.nextInt();

            if (userInput == difference){
                System.out.println("Correct Guess: " + difference);
                userScore++;
            }
            else{
                System.out.println("Incorrect Answer!!");
                System.out.println("Guess The Answer: ");
                if (userInput == difference){
                    userAttempt++;
                    

               }
           }
       
        
           counter++; 
           if (counter == 10){
            break;
        }
        
        }
        
    }
    
    

        
          
        
        
        
        

     System.out.println("The total score of the user is: " + userScore); 
     System.out.println(mytime);  
    }
    
   
    
    
      




}




