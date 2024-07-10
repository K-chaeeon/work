package ex0709.src;

class BB {
    int num = 10;

}


class CC {
    public void doA(BB a) {
        System.out.println("a.num = " + a.num);
        a.num = 30;

    }

}

public class Ex05 {

    public static void main(String[] args) {
        BB bb = new BB();   //bb=>참조변수 선언
        CC cc = new CC();

        cc.doA(bb);            //cc에 있는 doA(bb) -> BB a=bb -> BB bb=10 -> CC에서 a를 30으로 바꿈->bb=30
        System.out.println("bb.num = " + bb.num);

        //doA에 bb를 넘겨줌 -> BB bb==10 -> doA(bb)=doA(10) -> BB b=10 -> b.num=10

    }


}
