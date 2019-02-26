package primeNumber;

public class FindPrimeNumber {

    // create a method to find out a specific number is prime number or not
    public static boolean isPrimeNumber(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i< num ; i++){
            if(num % i== 0){
                return false;
            }
        }
        return true;
    }
    // if we want to find out there is a range of number is there have prime number or not

    public static void findPrimeNumber(int num){
        for(int i= 2; i<= num; i ++){
            if(isPrimeNumber(i)){
                System.out.println( i + " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("The number 12 is prime number or not ? " + isPrimeNumber(12));
        System.out.println("The number 1 is prime number or not ? " + isPrimeNumber(1));
        System.out.println("The number 2 is prime number or not ? " + isPrimeNumber(2));
        System.out.println("The number 13 is prime number or not ? " + isPrimeNumber(13));

        findPrimeNumber(30);

    }
}
