package fibonacci;

import java.util.Arrays;

public class Fibonacci {

    // create a function

    public static void main(String[] args) {

            int a[] = new int [40];
            for(int i = 0; i <40;i++){
                if(i<2){
                    a[i]=i;
                }else{
                    a[i]= a[i-2] + a[i-1];
                }
            }
        System.out.println(Arrays.toString(a));
    }
}
