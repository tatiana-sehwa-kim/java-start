package loop;

public class Break2 {
    static void main(String[] args) {

        int i;
        int sum = 0;

        for (i=1; ; i++) {
            sum = sum + i;

            if (sum > 10) {
                System.out.println(sum);
            break;
            }
        }
    }
}
