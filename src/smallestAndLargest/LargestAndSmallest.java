package smallestAndLargest;

import java.util.Arrays;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int number [] ={12,45,-67,9830,1,0};
        // we have to initialize smallest and largest first
        int largest = number[0];
        int smallest = number[0];
        for(int i =1;i < number.length;i++){
            if(number[i]> largest){
                largest= number[i];
            }
            else if(number[i]< smallest){
                smallest= number[i];
            }
        }
        System.out.println("The largest number is : "+ largest);
        System.out.println("The smallest number is :" + smallest);
        System.out.println("The Array is : " + Arrays.toString(number));
    }
}
