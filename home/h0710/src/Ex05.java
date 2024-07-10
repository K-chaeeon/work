public class Ex05 {

    public static void main(String[] args) {


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
//            totalNum = totalNum + num;
//
//        }
//        System.out.println(totalNum);
//    }
//}


//        ==================================================


        int num = 0;
        int r = 10;

        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= i; j++) {
                num = num + j;
            }
        }
        System.out.println(num);




    }
}



