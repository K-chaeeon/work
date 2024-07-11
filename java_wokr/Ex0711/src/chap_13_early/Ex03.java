package Ex0711.src.chap_13_early;

public class Ex03 {
    public static void main(String[] args) {

            String str = "안녕1내1이름은1홍길동";
            String[] tempstr = str.split("1");

//            String str = "안녕|내|이름은|홍길동";
//            String[] tempstr = str.split("\\|");

            for (int i = 0; i < tempstr.length; i++){
                    System.out.println(tempstr[i]);
            };


        String a = "abcdefgh";
        System.out.println(a.length());

        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));   //n번째에 잇는 값 출력
        System.out.println();
        System.out.println(a.substring(2));    //2번째부터 출력
        System.out.println(a.substring(2, 5));          //2번째부터 5번째까지만 출력
        System.out.println(a.toUpperCase());            //대문자로 출력
        System.out.println("cd를 포함하나 = " + a.contains("cd"));
        System.out.println();

        //특정위치의 값을 다른 값으로 바꾸기
        System.out.println("배열출력시작");

        char[] test = "테스트".toCharArray();
        for (int i = 0; i < test.length; i++) {
            System.out.println("test["+i+"]="+test[i]);
        }
        System.out.println("배열출력끝");

        test[2] = 'A';

        String testStr = new String(test);
        System.out.println(testStr);

        int[] b = new int[3];
        System.out.println(b.length);


    }


}
