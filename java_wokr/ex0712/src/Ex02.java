public class Ex02 {

    public static void main(String[] args) {


        String a = "abcd";
        String b = "java";
        String c = "system";

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());

        System.out.println("모든 문자열 길이 = " + (a.length() + b.length() + c.length()));    //QQQQQ
        //갯수를 나열하고 싶으면 괄호 빼기

//문자열 배열로 적기                //문자배열 -> char[] chars = new char[3]   이런거
//배열의 길이는 length
//스트링의 길이는 length(), charAt(), spilt, subString, toCharArray(),,,,


        String str[] = new String[3];
        str[0] = "abcd";
        str[1] = "java";
        str[2] = "system";

        //문자열 배열이 여러개이면 위에 QQQQQ처럼 표현하기 어려우므로

        int count = 0;
        for (int i = 0; i < str.length; i++) {
            System.out.println(i);
            System.out.println(str[i]);
            System.out.println(str[i].length());
            System.out.println();
            count = count + str[i].length();
        }
        System.out.println("모든 문자열의 길이는 " + count);
    }

}
