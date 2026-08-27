package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number); // double을 int로 넣야해서 컴파일오류
        printNumber((int) number); // 명시적 형변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }

}
