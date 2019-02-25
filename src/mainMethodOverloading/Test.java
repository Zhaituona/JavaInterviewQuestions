package mainMethodOverloading;

public class Test {
    public static void main(String[] args) {
        System.out.println("Method-1");
        main(12);
        main("hello");
        main(34,"java");
    }

    public static void main(String str) {
        System.out.println("Method -2");
    }

    public static void main(int a) {
        System.out.println("Method -3");
    }

    public static void main(int a , String str) {
        System.out.println("Method-4");
    }
}
