

public class Ex03 {


    public static void main(String[] args) {
        String str1 = "new String";
        String str2 = "new String";
//str1과 str2는 "new String"이라는 값 하나를 가리킴
        System.out.println(str1 == str2);


        String str3 = new String("new String");
        String str4 = new String("new String");
//new String 은 새로운 방 하나를 더 만드는 것이므로 서로 다른 "new String"을 가리킴
        System.out.println(str3 == str4);


        System.out.println(str3.equals(str4));
//각각 새로 만들어진 방에 있는 내용이 같은가? -> 같은 모양의 "new String"을 서로 가지고있음->true


        String str0 = str3;     //참조변수 특성
        System.out.println(str0==str3);

    }
}


