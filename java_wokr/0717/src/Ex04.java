
public class Ex04 {

    public static void main(String[] args) {

        String a = "asdf";
        String b = "zxcf";
        System.out.println(a+b);
        System.out.println(a.concat(b));
        System.out.println("asdf".concat(b));

        System.out.println(a.compareTo("asdf"));
        System.out.println(a.compareTo("ASDF"));
        System.out.println(a.compareTo("htr"));
        //값이 같으면 0, 사전편찬순 기준 비교하는 값이 더 우선이면 양수, 반대면 음수

        System.out.println();

        System.out.println(a.compareToIgnoreCase("ASDF"));
        System.out.println(a.compareToIgnoreCase("Asdf"));

        System.out.println();


        double e = 2.435435;
        String se = String.valueOf(e);
//        String se = e+"";     위에거랑 같음

    }


}
