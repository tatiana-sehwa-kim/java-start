package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //int -> long 형변환
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; //int -> double 형변환
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 200000000000000000L; //long -> double 20 롱 형
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
