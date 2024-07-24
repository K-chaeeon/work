package org.example.re;


public class Reser {    // 예약 정보(멤버)를 담는 클래스
    private String name;
    private String phone;
    private int wait;   //대기번호

    public Reser(String name, String phone, int wait) {
        this.name = name;
        this.phone = phone;
        this.wait = wait;
    }


    @Override                   // 손님 정보값 리턴을 위한 toString
    public String toString() {
        return "대기번호: " + wait + " / 이름: " + name + " / 전화번호: " + phone;
    }
}





