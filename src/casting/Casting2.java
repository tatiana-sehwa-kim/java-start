package casting;

public class Casting2 {
    public static void main(String[] args) {
        int intValue = 0;
        double doubleValue = (int) 1.5;

        // intValue = doubleValue; // 컴파일 오류 발생

        //소수점 날라가도 괜찮아 ㄱㅊㄱㅊ
        intValue = (int) doubleValue; //형변환

        System.out.println(intValue);
        System.out.println("doubleValue = " + doubleValue);
    }
}
