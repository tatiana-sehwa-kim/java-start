package method;

public class ex2LoopMethod {
    public static void main(String[] args) {

        print("Hello, world!", 3);
        print("Hello, world!", 5);
        print("Hello, world!", 7);
    }

    public static void print(String message, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(message);
        }
    }
}