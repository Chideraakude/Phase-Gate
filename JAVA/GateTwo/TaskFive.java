//
//import java.util.Scanner;
//public class TaskFive{
//
//    public static void main(String [] args){
//    
//    factorial();
//    
//    
//    }
//        
//
//        public static int factorial(){
//
//        int factorial= 1;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = input.nextInt();
//
//            for(int count = 1; count <=5; count++){
//                factorial *= count;
//                
//
//            }
//
//            return factorial;
//
//        }
//
//
//        
//
//    
//
//}

public class TaskFive {
    public static void main(String[] args) {

        int factorial = 1;

        for (int count = 1; count <= 5; count++) {
            factorial *= count;
        }

        System.out.println("Factorial of 5 is: " + factorial);
    }
}

