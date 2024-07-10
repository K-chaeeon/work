public class ex04 {

    public static void doA(int a) {
        System.out.println("a = "+a);
    }

    public static void doA(int a, int b) {  //메서드 명이 같아도 매개변수가 다르면 괜찮음
        System.out.println("a = "+a);
    }



    public static void main(String[] args) {

        doA(20);
        doA(10);

        int num1 = 10;
        int num2 = 20;

        if (num1 == 10) {
            num2 = 20;
        }

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //for 구문은 반복...0,1,2
        for (int i = 0; i < 3; i++) {
            int a = 20;
            System.out.println(a);
        }


    }
}
