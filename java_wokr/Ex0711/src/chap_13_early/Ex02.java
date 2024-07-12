package chap_13_early;

class Box {
    String conts;

//
//alt insert키 ->생성자 만들기
//alt insert키 ->toStrong 만들기

/*
int형 배열은 0으로 초기화 됨
String(객체)배열은 null로 초기호 됨
 */

    public Box(String conts) {
        this.conts = conts;
    }

    public String toString() {

        return "Box{ conts='" + conts + "' }";

    }

}

public class Ex02 {
    public static void main(String[] args) {
        Box[] boxs = new Box[10];
        boxs[0] = new Box("사과");
//            System.out.println(boxs[0]);
//            System.out.println(boxs[1]);
//            System.out.println(boxs[2]);
//            System.out.println(boxs[3]);
        //for구문으로

        for (int i = 0; i < boxs.length; i++) {
            System.out.println(boxs[i]);

        }
    }
}

