import java.util.Arrays;


public class ArrayOfArrays{


    public static void main(String[]args){

        int [] myCounts = arrayOfStrings("AaaBBc");

        System.out.println(Arrays.toString(myCounts));

        double [][] numbers = { {45.2, 90.28, 77.1},
                            {3.52, 9.86, 11.77},
                            {7.7, 10, 22.33, 12}


                            };
        






    }
    public static int [] arrayOfStrings(String userInput){

        userInput = "AaaBBc";
        int numberOfUpperCaseOfA = 0;
        int numberOfLowerCaseA = 0;
        int numberOfUpperCaseOfB = 0;
        int numberOfLowerCaseC = 0;

            for(int count = 0; count < userInput.length(); count++){

                char character = userInput.charAt(count);

                if (character == 'a'){
                numberOfLowerCaseA++;


            }
            else if (character == 'B'){
                numberOfUpperCaseOfB++;
                }
                else if (character == 'c'){
                numberOfLowerCaseC++;
                }
                else if (character == 'A'){
                numberOfUpperCaseOfA++;
                }
                 


            }
            System.out.println("A" + numberOfUpperCaseOfA + "a" + numberOfLowerCaseA + "B" + numberOfUpperCaseOfB + "c" + numberOfLowerCaseC);
            int[] arr = {numberOfUpperCaseOfA, numberOfLowerCaseA, numberOfUpperCaseOfB, numberOfLowerCaseC};

            return arr;
//
           



    }


    public int getLength(double[][] numbers){
		return numbers.length;
	}






}
