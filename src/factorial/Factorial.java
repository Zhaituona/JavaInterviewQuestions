package factorial;

public class Factorial {

    // create a function
    public static int factorialNumber(int num){
        int fact = 1;
        if(num==0){
            return 1;
        }
        for(int i =1; i <=num; i++){
            fact = fact*i;
        }
        return fact;
    }

    //it function calling itself

    public static int fact(int num){
        if(num ==0){
            return 1;
        }else{
            return ((num) * fact(num -1));
        }
    }
    public static void main(String[] args) {
        System.out.println( factorialNumber(12));
        System.out.println(factorialNumber(4));
        System.out.println(factorialNumber(1));
        System.out.println("*************");
        System.out.println(fact(4));
        System.out.println(fact(5));

    }
}
