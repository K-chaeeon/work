package z_chap10;

class InstClass {
    static int num = 0;

    InstClass() {
        num++;
        System.out.println(num);
    }
}

public class Ex05 {

    public static void main(String[] args) {
        System.out.println(InstClass.num); //객체 생성 안 해도 불러올 수 있음

//        InstClass in1 = new InstClass();
//        InstClass in2 = new InstClass();
//        InstClass in3 = new InstClass();
//        InstClass in4 = new InstClass();
//
//        System.out.println(in1.num);
    }
}
