

import java.util.Scanner;

public class TaskNine{
    public static void main(String[]args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.println("Enter a The price : ");
    int priceOfItem = inputCollector.nextInt();



        double taxAdded = (priceOfItem * 0.1);
        double newPriceOfItem = taxAdded + priceOfItem;

        System.out.println("The Price  of The Item With 10% Tax Added is: " + newPriceOfItem);

    



    }



}
