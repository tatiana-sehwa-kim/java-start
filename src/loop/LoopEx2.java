package loop;

public class LoopEx2 {
    static void main(String[] args) {

        int num = 2;
        int count = 1;

        //while
        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count ++;
        }

        //for
        for ( count = 1 ; count <=10; count ++ ){
            System.out.println(num);
            num += 2;
        }
        }
    }

