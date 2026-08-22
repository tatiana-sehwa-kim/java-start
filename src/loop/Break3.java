package loop;

public class Break3 {
    static void main(String[] args) {

        int sum = 0;

        for (int i=1; ; i++) {
            sum = sum + i;

            if (sum > 10) {
                System.out.println(sum);
            break;
            }
        }
    }
}
