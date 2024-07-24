package org.example;

public class Ex05 {

    public static void main(String[] args) {
        //throw 예외전달
        //throws 예외생성

        try {
            throw new MyException(new ErrorCode
                    ("ID를 입력하세요", "A101", "ID를 영어로 입력해주세요")
            );
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }


    }
}
