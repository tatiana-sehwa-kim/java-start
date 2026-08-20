package cond;

public class If6 {
    public static void main(String[] args) {

        int price = 500;
        int age = 13;

        int discount = 0;

        if ( price >= 10000 ) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매 할인");
        } else if ( age <=10 ) {
            discount = discount + 1000;
            System.out.println("10세 이하 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("할인금액: " + discount);

        }

    }
