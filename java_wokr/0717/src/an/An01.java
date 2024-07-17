package an;
/*
1. "Hello.java" 문자열에서 파일명은 Hello와 확장자인 java를 분리시켜보자.

    입력 >>Hello.java
    출력
    파일명 Hello
    확장자 java

Hello.java를 입력받음
 */

/*파일업로드시 확장자가 exe파일일 때 올릴 수 없도록 검사할 때 쓰임
 if (temp[0].equals("exe"));
            return;

 */

import java.util.Arrays;

public class An01 {

    public static void main(String[] args) {
        String str = "Hello.java";
        String temp[] = str.split("\\.");
        //split 안에 정규표현식 쓸 수 있음(문자 안에 어떤 게 들어가있는지 찾는 거)
        System.out.println("파일명 "+temp[0]);
        System.out.println("확장자 "+temp[1]);



        str = "Hello.java";
        temp = str.split("[A-Z]");  //A-Z 대문자 찾기
        System.out.println(Arrays.toString(temp));

        str = "안녕하세요..머만들까요11!?";
        temp = str.split("\\d");        //0~9사이 숫자 찾기
        System.out.println(Arrays.toString(temp));






    }
}
