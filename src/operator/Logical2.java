package operator;

public class Logical2 {
    public static void main(String[] args) {

       // 15 정수가 10 이상 20 이하 숫자인게 참인지 거짓인지 출력해보기
        int a = 15;

        boolean result = 10 <= a && a <= 20;
        System.out.println("맞다면 " + result + " 라고 외쳐주세요");

    }
}
