public class ex05 {

    /*
    5! = 5*4!
    4! = 4*3!
    3! = 3*2!
    재귀함수=자기자신의 함수를 호출하는 것
     */

    //    public static int fact( int NUM ) {
//
//        fact(3);
//
//
//    }
    public static int fact(int num) {   // (String[] args) =>배열  //22222222

        if (num > 0) {
            return num * fact(num - 1);         //333333333  //555555       //77777        //9999
            //5* fact(4)                        //4444444444
            //5*4*fact(3)                                               //66666666
            //5*4*3*fact(2)                                                             //888888
            //5*4*3*2*fact(1)                                                                       //10...
            //5*4*3*2*1*fact(0)

        } else {
            return 1;
            //5*4*3*2*1*1
        }
    }

    public static void main(String[] args) {
        int result = fact(2);       //fact=!(팩토리얼)       1111111
        System.out.println(result);


//        String[] strary = {"aa","bb","cc"};
//        System.out.println("배열선언함");
//        main(strary);
        // =>이런식으로하면 오버플로우 뜸
    }
}

