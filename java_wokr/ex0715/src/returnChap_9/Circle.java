package returnChap_9;

class Circle {
//private 변수는 setter getter로 참조 가능함

    private int rad;            //@@@@@@@@@@@@@@@@@
    private String name;


    public Circle(int rad) {
        this.rad = rad;
    }

    public String getName() {           //alt insert->setter and getter하면 자동으로 만들어줌
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            this.name = "홍길동";
            return;
        }
        this.name = name;
    }

    //이 함수를 통해서 반지름 넣는 것만 해라
    public int getRad() {            //getter
        return rad;
    }

    public void setRad(int rad) {         //22222222222
        if (rad < 0) {                       //3333333333
            rad = 0;
            return;              //4444444444444

        }
        this.rad = rad;

    }

    public double getArea() {
        return 3.14 * rad * rad;
    }
}
