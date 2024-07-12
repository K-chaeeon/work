import aa.Box;

public class Ex01_2 {


    public static void main(String[] args) {


        Box[] boxes = new Box[3];

        boxes[0] = new Box();
        boxes[1] = new Box("사과", 50);
        boxes[2] = new Box("바나나", 30);

        System.out.println(boxes[0]);
        System.out.println(boxes[1]);
        System.out.println(boxes[2]);

//        Box abox = new Box();
//        Box bbox;
//        Box cbox;
//갯수가 많으면 ~box를 계속 만들 수 없으므로 방을 만들어서 값을 넣어준다.

    }

}
