import java.util.Arrays;


public class WarmUpTask{

    public static void main(String[]args){

    int [] numbers = {9,2,3,2,1};
     System.out.println(Arrays.toString(returnNoneDuplicateValue(numbers)));





    }



    public static int [] returnNoneDuplicateValue(int [] numbers){

       int[] arr = new int[numbers.length];
        int newIndex = 0;

        for (int count = 0; count < numbers.length; count++) {

            int current = numbers[count];
            int occurrences = 0;

            for (int counter = 0; counter < numbers.length; counter++) {
                if (numbers[counter] == current) {
                    occurrences++;
                }
            }


            if (occurrences != 2) {


                boolean alreadyAdded = false;
                for (int newCount = 0; newCount < newIndex; newCount++) {
                    if (arr[newCount] == current) {
                        alreadyAdded = true;
                        break;
                    }
                }

                if (!alreadyAdded) {
                    arr[newIndex] = current;
                    newIndex++;
                }
            }
        }


        int[] result = new int[newIndex];
        for (int counter = 0; counter < newIndex; counter++) {
            result[counter] = arr[counter];
        }

        return result;
    }
      public int getLength(int[] numbers){
		return numbers.length;




}

}
