public class Ex03 {

    public static int doA() {

        int a = 10;
        System.out.println("doA");
        System.out.println("a = "+a);

        return a;           //a를 메인함수에 보내서 daA함수를 벗어나도 쓸 수 있도록 해줌
                            // (첫줄에 void대신 int나 String적고 함수 마지막에 return넣어주기)
    }

    public static void main(String[] args) {
        int a = doA();      //위에 int적었으면 int, Strong적었으면 Stong으로 좌표 맞춰주기
        System.out.println("main a = "+a);

    }

}
