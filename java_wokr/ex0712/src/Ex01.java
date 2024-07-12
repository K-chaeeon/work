import aa.Box;

public class Ex01 {

    public static void main(String[] args) {

//인스턴스화. 메모리에 적재된다.
        Box abox =new Box();            //기본생성자     //@@@@@@@@@@@@
        Box bbox =new Box("사과");                   //############
        Box cbox =new Box("바나나", 10);          //%%%%%%%%%%%%


        System.out.println(abox.toString());    //toString()생략
        System.out.println(bbox);
        System.out.println(cbox);



    }
}
