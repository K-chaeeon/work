package ex0710.src.ex0710.src;

class B {
    //toSTring 생략 개발자 임의로 적게되면 적은 내용 실행
    //생성자도 생략 가능
    int a = 10;

    public B() {   //생성자. 생략된 문법. 반환값이 없음
        System.out.println("생성자");
        a = 20;


    }


//     public String toString(){ return "sfds"}     //생략된 문법

}

public class Ex02 {


    public static void main(String[] args) {
        //생성자는 함수랑 비슷한 모양이지만 변환값을 적지 않는다.

        B b = new B();
        System.out.println(b);


    }
}
