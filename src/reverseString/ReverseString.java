package reverseString;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Selenium";
        int length = s.length();
        // 1. use for loop , count from back to forward
        String rev= "";
        for(int i =length-1; i >=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        // 2. use StringBuffer

        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
    }
}
