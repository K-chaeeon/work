public class ex01an {

//    public static void main(String[] args) {
        /*
        i = 0일 때, j가 0~0이하까지 =>1번반복
        i = 1일 때, j가 0~1이하까지 =>2번반복
        i = 2일 때, j가 0~2이하까지 =>3번반복
        ...

         */


//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");      //줄바꿈X
//            }
//            System.out.println();           //줄바꿈

    public static void doA() {
        int i = 0;
        while (i < 10) {

            int j = 0;
            while (j <= i) {
                j++;
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        /*...*/
        doA();
    }


}



