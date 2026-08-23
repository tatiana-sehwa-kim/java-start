package casting;

public class casitng3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting= " + maxIntValue);

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver = " + intValue); // - 한바퀴 돌아 마이너스로 표현 오버플로우




    }
}
