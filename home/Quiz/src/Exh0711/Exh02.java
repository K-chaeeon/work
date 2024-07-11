package Quiz.src.Exh0711;
//        2. 1~100사이에서 3의 배수만 더하기

public class Exh02 {
    public static void main(String[] args) {


        int num = 0;
        for (int i = 1; i<=100; i++) {

            if (i % 3 == 0) {
                num += i;

            }

        }
        System.out.println(num);
    }
}



