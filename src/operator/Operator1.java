package operator;

public class Operator1 {
    public static void main(String[] args){

        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);  //출력 a + b = 7

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        //곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈
        int div = a / b;
        System.out.println("a / b = " + div);  // int 형은 소숫점 ㄴㄴ

        //나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);

        // int z = 10 / 0;  0으로 나누면 오류. 예외처리 나중에.
        //                  위 나눗셈에서 0으로 나누면 그다음 나머지 계산을 안해버림

    }
}
