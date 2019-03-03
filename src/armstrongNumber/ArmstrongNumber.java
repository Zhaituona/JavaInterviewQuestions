package armstrongNumber;

public class ArmstrongNumber {

    // create a function
    public static void isArmstrongNumber(int num){
        System.out.println("The " + num + " is Armstrong Number ?");
        int cube = 0;
        int r ;
        int t;
        t= num;
        while(num >0){
            r = num%10;
            num = num/10;
            cube = cube + (r*r*r);
        }
        if(t==cube){
            System.out.println("This is Armstrong Number");
        }else{
            System.out.println("This is not Armstrong Number");
        }
    }

    public static void main(String[] args) {
        isArmstrongNumber(123);
        isArmstrongNumber(153);
        isArmstrongNumber(407);
    }

}
