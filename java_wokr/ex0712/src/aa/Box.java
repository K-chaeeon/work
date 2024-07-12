package aa;

//(A)변수를 선언한다 -> (B)new어쩌구에 입력한 값을 받는 방을 만든다 -> (C)main으로 다시 보내준다(toSting)

public class Box {

//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    String name;
    int count;

    /*
    기본생성자는 생략 가능함
    but,다른생성자를 선언하면 기본생상자 생략 불가
     */

    /*
    접근제어지지자
    public, protected, difault, private .,,,,
     */



//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
    public Box() {              //222 생략된 기본생성자도 적어줘야함                //@@@@@@@@@@@@
        System.out.println("기본생성자 호출");
    }

    public Box(String n) {         //매개변수가 있는 다른생성자 선언해서 11111      //############
        name = n;
        System.out.println("n 다른생성자 호출");
    }

    public Box(String n, int c) {                                              //%%%%%%%%%%%%
        name = n;
        count = c;
        System.out.println("n c 다른생성자호출");
    }



    //CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
    public String toString() {
        return "Box name = " + name + " count = "+count;
    }
//위에 toString() 생략하면 주소값 출력됨





}





//메서드 이름 동일할 수 없음 파라메터(매개변수)가 다르면 괜찮음
//e.g.
       /*

        public void doA() {
            public void doA (String a){
            }
        */