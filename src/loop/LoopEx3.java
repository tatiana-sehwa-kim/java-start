package loop;

public class LoopEx3 {
    static void main(String[] args) {

        int max=3;
        int sum=0;
        int i=0;

        /** while문
        while ( i <= max) {
            sum = sum + i;
            i++;
        }
            System.out.println("sum: " + sum);
        **/

        //for문
        for ( i = 0; i <= max ; i++ ) {
            sum = sum + i;
            }
        System.out.println("sum: " + sum);

    }
}

