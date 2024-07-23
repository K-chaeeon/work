package org.example.inter;

public interface Printable {

    //static final 변수는 대문자로 짓는 게 관례


    public static final int HEIGHT = 70;    //public static final 생략되어있음. 안 적어도 ok
    int WIDHT = 120;

//    void doA();     -> public 생략되어있음

    void print(String mydoc);


    default void clean(){
        System.out.println("청소기능 추가");
        //객체생성을 통해 메인에서 호출할 수 있음(new~)
    }
    static void printLine(){
        System.out.println("한 줄 출력할 때 줄바꿈");
        //스테틱이라서? 메인에서 객체생성 안 하고 바로 호출가능
    }


}
