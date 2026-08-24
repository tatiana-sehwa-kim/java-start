package scanner;

import java.util.Scanner;

class ScannerWhile1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("문자열을 입력하세요(종료:exit) : ");
                String str = scanner.nextLine();
                System.out.println("입력된 문자열: " + str);

                if (str.equals("exit")) {
                    System.out.println("프로그램이 종료됩니다.");
                    break;
                }

            }
        }
    }