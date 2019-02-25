package swapString;

public class SwapString {
    public static void main(String[] args) {
        String  a= "java";
        String b = "hello";
        System.out.println("Before swap ");
        System.out.println("The a is :" + a);
        System.out.println("The b is : " + b);
        // append
        a =a+b;  // javahello
        b =a.substring(0,a.length()-b.length());
        a= a.substring(b.length());
        System.out.println("The a is :" + a);
        System.out.println("The b is : " + b);
    }
}
