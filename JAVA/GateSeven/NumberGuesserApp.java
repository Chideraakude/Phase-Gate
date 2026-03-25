



import java.util.Scanner;
import java.util.Random;


public class NumberGuesserApp{

    public static void main (String [] args){
    guessANumberApp();


    }



    public static int guessANumberApp(){

        Random random = new Random();
        int userAttempt = 0;
        boolean correctNumber = false;
        int randomNumber = (int) (Math.random() * 100)+ 1;
        System.out.println(randomNumber);
        
    
     while (userAttempt < 5){
        int secretNumber = randomNumber;

            Scanner input = new Scanner(System.in);
            System.out.println("Guess a number from the random number from 1 - 100: ");
            
            if (!input.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                input.next();
                continue;
            }

            
            int userGuesses = input.nextInt();


            if (userGuesses == randomNumber){
                System.out.println("Correct Guess: " + userGuesses);
                correctNumber = true;
                break;

            }
            else if (userGuesses < 1 || userGuesses > 100){
                System.out.println("Number must be between 1 and 100");
                System.out.println("Guess a number from the random number: ");
                continue;

           }
           userAttempt++;

            if (userGuesses < randomNumber){
                System.out.println("Incorrect Answer!!, Your Guess Is Way Too Low");
            }
            else{
                System.out.println("Incorrect Answer!!, Your Guess Is Way Too High");
            }

             String rating;
            if (userAttempt == 1){
                rating = "Legendary";
    
            } 
            else if (userAttempt == 2){

                rating = "Excellent";
            }
            else if (userAttempt <= 4){ 
                rating = "Good";
            }
            else {
                rating = "Better luck next time";
            }        
         
            System.out.println("\n---------- GAME SUMMARY ----------");
            System.out.println("Correct Number: " + randomNumber);
            System.out.println("Attempts Used: " + userAttempt);
            System.out.println("Rating: " + rating);

        


    }
    return userAttempt;

}
    
}

