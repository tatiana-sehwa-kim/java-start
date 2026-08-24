package scanner;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int num = scanner.nextInt();

        System.out.println(num + "단의 구구단");
        for (int a= 1; a <= 9 ; a++) {
            int gop = num * a;
            System.out.println(num + " x " + a + " = " + gop);
        }


    }
}
