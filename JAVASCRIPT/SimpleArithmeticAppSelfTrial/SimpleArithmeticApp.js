    const prompt = require("prompt-sync")();

   let userScore = 0;
    

    let counter = 0;

    while (counter < 10){
        let userInput = 10;
        while (true){
            let firstNumber = Math.floor(Math.random() * 10);
            let secondNumber = Math.floor(Math.random() * 10);
            let difference = (firstNumber > secondNumber) ? (firstNumber - secondNumber) : (secondNumber - firstNumber);

                (firstNumber > secondNumber) ? console.log(firstNumber + "-" + secondNumber + " " + "=" + " " + "?") : console.log(secondNumber + "-" + firstNumber + " " + "=" + " " + "?");
                //console.log(firstNumber + "-" + secondNumber + " " + "=" + " " + "?");

            
            let userAttempt = 0;

            let userInput = Number(prompt("Guess The Answer: "));

            if (userInput == difference){
                console.log("Correct Guess: " + difference);
                userScore++;
            }
            else{
                console.log("Incorrect Answer!!");
                prompt("Guess The Answer: ");
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
 

     console.log("The total score of the user is: " + userScore); 
     //console.log(mytime);  



