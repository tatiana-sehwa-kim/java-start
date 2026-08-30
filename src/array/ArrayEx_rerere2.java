package array;

import java.util.Scanner;

public class ArrayEx_rerere2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: //상품 등록
                    if (productCount >= 10) {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        break;
                    }
                    if (productCount < 10) {
                        System.out.print("상품 이름을 입력하세요: ");
                        productNames[productCount] = scanner.nextLine();
                        System.out.print("상품 가격을 입력하세요: ");
                        productPrices[productCount] = scanner.nextInt();
                        productCount++;
                        break;
                    }

                case 2: //상품 목록
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                        break;
                    }
                    else if (productCount != 0) {
                        for (int i = 0; i < 10; i++) {
                            System.out.println(productNames[i] + ":" + productPrices[i]);
                        } break;
                    }
                case 3: //종료
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
                    break;
            }


        }
    }
}
