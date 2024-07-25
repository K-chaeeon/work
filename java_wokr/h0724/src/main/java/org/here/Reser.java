package org.here;

public class Reser {          // 예약 정보(멤버)를 담는 클래스

    private String name;
    private String phone;
    private int wait;   //대기번호

    public Reser(String name, String phone, int wait) {
        //매개변수 세 개를 가진 생성자
        this.name = name;
        this.phone = phone;
        this.wait = wait;
    }


    public String toString() {
        return "대기번호: " + wait
                + " / 이름: " + name
                + " / 전화번호: " + phone;
    }

}


