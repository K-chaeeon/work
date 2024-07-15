package returnChap_9.quiz;
/*
1. 문자열을 입력받아 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
    제한사항 1<= str의 길이 <=10
    입력 #1
    abcde
    출력
    a
    b
    c
    d
    e
    */

//값을 입력받는다->변수 String str ="입력값"
//str의 길이를 구한다 = str.length
//for (int i = 0; i < str.length; i++) str[i]=
//str[
 import java.util.Scanner;
public class Q01 {

    public static void main(String[] args) {
        System.out.print("값을 입력하세요: ");

        Scanner scanner=new Scanner(System.in);
        String str = scanner.next();
        System.out.println(str.length());


        for(int i = 0; i<str.length(); i++){

            String a[] = str[i];

            System.out.println(a);
        }
    }
}

/*
String str[0]=안
String str[1]=녕
String str[2]=하
String str[3]=십
String str[4]=니
String str[5]=까
 */
