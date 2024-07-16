package aa;

public class Circle {

    public static final double PI = 3.1415;
    public static int a = 10;



public void do둘레(){
    System.out.println(2*PI*a);
}

public void do넓이(){
    System.out.println(a*a*PI);
}

    public int doA() {  //여기에 static적으면 프로그램 시작하자마자 바로 열리고
                        // 끝날 떄까지 메모리 차지함
                        //메인에서 호출 안 하면 메모리화 되지 않음
        //1~9
        //sum??
        int sum = 0;    //doA()사용 후엔 삭제되므로 메모리 손해 없음
        for (int i = 1; i < 10; i++) {
            sum += i;

        }
        return sum;
    }

}

