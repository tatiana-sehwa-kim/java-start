package cond;

public class condEx2 {
    public static void main(String[] args) {

        int distance = 700;
        String grade;

        if (distance <= 1) {
            grade = "도보";
        } else if (distance <= 10) {
            grade = "자전거";
        } else if (distance <= 100) {
            grade = "자동차";
        } else {
            grade = "비행기";
        }

        System.out.println("distance: " + distance);
        System.out.println(grade + "를 이용하세요.");
    }
}
