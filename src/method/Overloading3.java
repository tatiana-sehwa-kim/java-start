package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2,1.5));
    }

//    public static int add(int a, int b) {
//        System.out.println("1번 호출");
//        return a + b;
//    } 자동형변환으로 실행이됨. 딱맞는애가 없어지면 자동형변환으로 되는메서드로 들어간다.

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
