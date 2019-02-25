package stringManupilation;

public class StringManupilation2 {
    public static void main(String[] args) {
        String s = "I like java , I like learning ";
        String s1 = "i LIKE JAVA , i like learning ";
        String s2 = " hello java ";
        // length of the String
        System.out.println(s.length());
        System.out.println(s2.length());
        // index
        System.out.println(s.indexOf('i'));
        System.out.println(s.indexOf('e'));
        System.out.println(s.indexOf('e',s.indexOf('e')+1));
        // substring
        System.out.println(s.substring(6));
        System.out.println(s.substring(4,9));
        // String compare
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        // trim method for remove space between two words
        System.out.println(s2.trim());
        System.out.println(s2.replace(" ",""));
        // remove or change some special character
        String s3 = "01/28/1987";
        System.out.println(s3.replace("/","-"));
        // split
        String s4 = "Java_Selenium_Jenkins_Maven";
          String array[] =s4.split("_");
          for(int i = 0; i <array.length;i++){
              System.out.println(array[i]);
          }
          // concat
        String s5 = "carre";
        System.out.println(s5.concat("r"));
        // String and int concat
        String x = "hello";
        String y = "java";
        int a = 100;
        int b = 200;
        System.out.println(x+y);
        System.out.println(a+b);
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));

    }
}
