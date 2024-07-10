
public class Ex04 {


    public static void main(String[] args) {
     /*
     1+2+3+...+10
      */
        int sum = 0;   //총합
        int i = 1;     //더하는 단위
        int endNum = 10;   //몇번(어디까지) 더하는지

        while (i <= endNum) {

            sum = sum + i;
            i++;

        }
        System.out.println(sum);
    }
}
        /*
        2+4+6+...+50
         */

//        int num = 0;
//        int i = 0;
//        int endNum = 50;
//
//        while(i<=50) {
//            num = num +i;
//            i=i+2;
//        }
//        System.out.println(num);




        /*
        1+(1+2)+(1+2+3)+....+(1+2+3+...+10)
        */

//        int num = 0;
//        int i = 0;
//        int totalNum = 0;
//        int r = 10;
//
//        while (i <= r) {
//
//            num = (num + i);
//            i++;
//            totalNum=totalNum+num;
//
//        }
//        System.out.println(totalNum);
//
//
//        ==================================================
//
//        int num = 0;
//        int r = 10;
//
//        for (int i = 0; i <= r; i++) {
//            for (int j = 0; j <= i; j++) {
//                num = num + j;
//            }
//        }
//        System.out.println(num);
//
//        ======================================================







