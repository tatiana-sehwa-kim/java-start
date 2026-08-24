package scanner;

import java.util.Scanner;

class ScannerWhile3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int sum = 0;

            while (true) {
                System.out.println("정수를 입력하세요(0 입력시 종료): ");
                int number = input.nextInt();

                sum += number;

                if (number == 0) {
                    break;
                }
            }
            System.out.println("정수의 합: " + sum);
        }
    }