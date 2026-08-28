package method;

public class ex3MethodBank {

    public static void main(String[] args) {
        int balance = 10000;

        // 입금 1000
        int newbalance = deposit(10000, 1000);
        System.out.println("현재 잔액: " + newbalance + "원");

        // 출금 2000

        balance = withdraw(newbalance,2000);
        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.print(depositAmount + "원을 입금하였습니다. ");
        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니 다.");
        }
        return balance;
    }
}

