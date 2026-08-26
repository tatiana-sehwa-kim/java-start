package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] students = new int[4][3];
        int[] sum = {0,0,0,0};
        double[] average = {0,0,0,0};

        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1)+"번 학생의 성적를 입력하세요:");
            System.out.print("국어 점수:");
            students[i][0] = scanner.nextInt();
            System.out.print("영어 점수:");
            students[i][1] = scanner.nextInt();
            System.out.print("수학 점수:");
            students[i][2] = scanner.nextInt();

            sum[i] = students[i][0] + students[i][1] + students[i][2];
            average[i] = (double) sum[i] / students[0].length;
            }

        for (int i = 0; i < students.length; i++) {
        System.out.println(i + "번 학생의 총점: " + sum[i] + ", 평균: " + average[i]);
    }


    }
}
