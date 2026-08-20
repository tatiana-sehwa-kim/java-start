package cond;

public class If5 {
    public static void main(String[] args) {

        int price = 12000;
        int age = 9;

        int discount = 0;

        if ( price >= 10000 ) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매 할인");
        }
        if ( age <=10 ) {
            discount = discount + 1000;
            System.out.println("10세 이하 할인");
        }

        System.out.println("할인금액: " + discount);

    }
}
