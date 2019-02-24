package removeJunk;

public class RemoveJunk {
    public static void main(String[] args) {
        String s = "hello%&^&()";
        // 1 . regular Expression
        s= s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
        String s1 = "*&^%$java";
        s1 = s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);
    }
}
