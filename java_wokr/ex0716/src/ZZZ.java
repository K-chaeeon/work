//상속, aa.AAA같이 참고

public class ZZZ extends aa.AAA {

    int zzz = 10;

    ZZZ(){      //@@@@
        System.out.println("여기까지 할 거예요.");
        System.out.println(zzz);
        System.out.println(aaa);
    }



    public static void main(String[] args) {
        ZZZ zzz = new ZZZ();  //기본생성자 호출@@@

    }

}
