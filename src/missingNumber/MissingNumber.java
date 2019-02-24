package missingNumber;

public class MissingNumber {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,7,8,9};
        int sum =0;
        for(int i =0; i < array.length; i ++){
            sum = sum + array[i];
        }
        System.out.println(sum);

        int total =0;
        for( int j = 1; j <=9; j ++){
            total = total + j;
        }
        System.out.println(" The missing number is "+ (total -sum));
    }
}
