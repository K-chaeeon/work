public class Ex07 {

    public static void main(String[] args) {

        System.out.println();

        //0 < result < 1
        //0.00000001<= result <= 0.9999999
        //0.00000100<= result <= 99.999999
        //3.00000100<= result <= 102.99999


        for (int i = 0; i < 10; i++) {   //값을 10개 뽑아줌
            double result = Math.random()*10; //0에서 1 내의 값 중 하나를 랜덤으로 return 해줌
            //*100하면 1~99사이의 수 랜덤으로 return 해줌
            System.out.println(result);    //(int)result 하면 정수 나옴

        }

    }
}
