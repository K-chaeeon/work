package an;
/*
문자열 my_string, overwrite_string과 정수 s가 주어집니다.
문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

입출력 예
 my_string	    overwrite_string	s	result
"He11oWor1d"	   "lloWorl"	    2	"HelloWorld"
"Program29b8UYP"	"merS123"    	7	"ProgrammerS123"
 */

import java.util.Arrays;

public class An03 {

    An03() {
        System.out.println("일로옵니다");        //@@@@@@@@@@@@@@@@@@@

        String result = solution("He11oWor1d", "lloWorld", 2);
        System.out.println(result);

//        System.arraycopy(  );  로도 ㅠ풀 수 있음

    }


    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] c_my_string = my_string.toCharArray();
        char[] c_overwrite_string = overwrite_string.toCharArray();

        System.out.println(Arrays.toString(c_my_string));
        System.out.println(Arrays.toString(c_overwrite_string));

        System.arraycopy(c_overwrite_string, 0,
                c_my_string, s, overwrite_string.length());

        System.out.println(Arrays.toString(c_my_string));
        answer = new String(c_my_string);

        return answer;
    }


    public static void main(String[] args) {

        new An03();         //호출하면@@@@@@@@@@@@@@


    }

}

