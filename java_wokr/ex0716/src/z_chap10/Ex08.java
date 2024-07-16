package z_chap10;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.lang.Math.PI;

class AA {
    public static BB bb = new BB();
}

class BB {
    public void doA() {
        System.out.println("BB doA");
        //System이라는 클래스 /  out이라는 변수/ static으로 선언되어있음
    }
}


public class Ex08 {

    public static void main(String[] args) {
        System.out.println(PI);         //스프링부트에서 사용함

        AA.bb.doA();
        //AA라는 클래스 /  bb라는 변수


        LocalDate localdate = LocalDate.now();      //.now ->static함수. 윈도우 시간을 가져옴
        LocalDate localtime = LocalDate.now();
        LocalDateTime localdatetime = LocalDateTime.now();

        System.out.println(localdate);
        System.out.println(localtime);
        System.out.println(localdatetime);

    }
}
