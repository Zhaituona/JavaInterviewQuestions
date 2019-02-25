package swapInteger;

public class SwapInteger {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        //1. use temp variable ;
//        int temp;
//        temp =x;
//        x=y;
//        y= temp;
//        System.out.println("The x is : " + x);
//        System.out.println("The y is :" + y);

        //2. use + operator
//        x =x+y;
//        y=x-y;
//        x=x-y;
//        System.out.println("The x is : " + x);
//        System.out.println("The y is :" + y);

        // 3. use * operator
//        x= x*y;
//        y= x/y;
//        x=x/y;
//        System.out.println("The x is : " + x);
//        System.out.println("The y is :" + y);

        // 4. use ^ operator
        x =x^y;
        y=x^y;
        x=x^y;
        System.out.println("The x is : " + x);
        System.out.println("The y is :" + y);

    }
}
