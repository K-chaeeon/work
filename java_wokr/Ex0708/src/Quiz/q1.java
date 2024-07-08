package Quiz;

import javax.imageio.stream.ImageInputStream;

public class q1 {

//    1. 2의 n승을 구하는 함수를 재귀적으로 구현해 보자.
//    그리고 그에 따른 적절한 함수를 구현해 보자.


    /*
    2^1 = 2! = 2!*1
    2^2 = 2!*2! = 2!*2
    2^3 = 2!*2!*2! = 2!*3
     */

    public static int fact(int num1) {
        if (num1 > 0) {
            //2*fact(4)
            //2*2*fact(3)
            //2*2*2*fact(2)
            //2*2*2*2*fact(1)
            //2*2*2*2*2*fact(0)

            return 2 * fact(num1-1);
        } else {
            return 1;
            //2*2*2*2*2*1
        }
    }


    public static void main(String[] args) {

        int result = fact(5);
        System.out.println(result);


    }

}


