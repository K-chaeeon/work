

public class Ex04 {
    //기본생성자 toString()생략되어있음
    Ex04() {                                    //22222222222222222
        int ar[] = {10, 20, 30, 40, 50};
        //doA();      //doA()메서드 호출           //444444444444444444        //777777777777777777
        doA(ar);
        int br[] = makeary(10);
        System.out.println("br.length = "+br.length);
    }

    public void doA(int[] qw) {                          //5555555555555
        //   System.out.println("doA메서드 호출");        //66666666666666

        int sum = 0;
        for (int i = 0; i < qw.length; i++) {
            sum += qw[i];
        }
        System.out.println(sum);
    }

    public int[] makeary(int len) {
        return new int[len];
    }


    public static void main(String[] args) {

        new Ex04();     //기본생성자 호출          //111111111111111111111
        //8888888888888888888888

    }
}
