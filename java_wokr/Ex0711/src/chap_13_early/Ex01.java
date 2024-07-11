package Ex0711.src.chap_13_early;

public class Ex01 {



    public static void main(String[] args) {



        int a[] = new int[10];      //int 공간 10개 생김
        int c[] = a;    //참조변수. c는 int a[]를 가리킴
        int b[] = {1,2,3,4};        //0번째,1번째,2번째,3번째

        System.out.println("a.length = "+a.length);   //a의 길이

        System.out.println();
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[9]);

//        System.out.println(a[10]);//0부터 시작해서 10개 만들면 0~9까지만 들어감

//int배열은 값을 넣지 않으면 0으로 초기화 됨


        a[0] = 20;
        System.out.println(a[0]);
        System.out.println();
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);



    }





}
