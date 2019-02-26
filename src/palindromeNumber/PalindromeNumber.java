package palindromeNumber;

public class PalindromeNumber {
    // palindrome number id like 121 , 454, 787 , 989
    // create a function
    public static void isPalindromeNumber(int num){
        System.out.println("The " + num + " is palindrome number or not ? ");
        int r = 0;
        int sum =0;
        int t;
        t = num;
        while(num > 0){
            r = num % 10;
            sum = (sum * 10) + r;
            num = num /10;
        }
        if(t ==sum){
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("Not palindrome number");
        }
    }

    public static void main(String[] args) {
        isPalindromeNumber(34);
        isPalindromeNumber(121);
        isPalindromeNumber(454);

    }
}
