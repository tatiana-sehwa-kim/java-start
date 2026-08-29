package method;

import java.util.Scanner;

public class ex4MethodBank2_refactoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;

        while (true) {
            System.out.println("----------------------------------------\n1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료\n----------------------------------------");
            System.out.print("선택: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: //입금
                    System.out.print("입금액을 입력하세요: ");
                    int depositAmount = scanner.nextInt();
                    balance = deposit(balance, depositAmount);
                    System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
                    break;

                case 2: //출금
                    System.out.print("출금액을 입력하세요: ");
                    int withdrawAmount = scanner.nextInt();
                        if (withdrawAmount > balance) { //잔액부족
                            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
                        }
                        if (withdrawAmount <= balance) { //정상출금
                            balance = withdraw(balance, withdrawAmount);
                            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
                        }
                    break;

                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break; // 이 스위치문 그만하고 나갈래! / continue; 이번 바퀴는 여기까지 하고 다음 바퀴로 넘어갈래!

                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return; // return은 프로그램 종료

                default: // 5번같은거 누르면 이걸루
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount) {
        balance -= withdrawAmount;
        return balance;
    }
}