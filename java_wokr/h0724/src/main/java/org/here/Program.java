package org.here;
      /*

    하루에 10명만 예약받는 가게

    손님이 입력하는 값: 이름, 전화번호
    입력 후 대기 번호 출력받음.

    대기 번호를 입력하면 해당 대기 번호를 받은 손님의 정보를 조회할 수 있음


    **필요한 것**
    대기번호 변수(1부터 시작)
    <예약>
    입력할 변수 => 손님 이름, 번호
    손님의 정보와 부여받은 대기 번호를 세트로 저장할 때 쓸 배열
    손님의 정보를 초기화할 인스턴스
    <조회>
    입력한 대기 번호에 맞는 손님 정보를 리턴받아야 함
    정보를 조회할 때 입력할 대기 번호 변수
    (내가 입력하는 값이므로 위에 있는 대기번호를 저장할 변수와는 별개로 두기)

    *고려해야 할 것*
    배열은 0부터 시작하지만 대기 번호는 1부터 시작함
    예약 조회를 할 때 예약이 비어있는 대기 번호(null)를 입력했을 경우
    프로그램이 종료되지 않는 한 되돌아가서 계속 스캔

     */

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Reser[] re = new Reser[10];      //Reser 객체 참조배열 생성 -> 손님정보 10개 담을 수 있음

        int wait = 1;    // wait -> 대기 번호

        while (true) {
            System.out.println("1.예약");
            System.out.println("2.조회");
            System.out.println("3.종료");
            System.out.print("입력: ");
            int input = scanner.nextInt();

            switch (input) {
                case 1: //예약
                    scanner.nextLine();
                    System.out.print("이름: ");
                    String name = scanner.nextLine();
                    System.out.print("전화번호: ");
                    String phone = scanner.nextLine();

                    Reser reservation = new Reser(name, phone, wait);   // 인스턴스 생성, 참조변수 reservation에 할당
                    re[wait - 1] = reservation;                         //배열자리는 0부터 시작하므로 -1 해줘야 함
                    // 위에서 입력한 name, phone과 대기번호 wait을 저장
                    System.out.println("예약이 완료되었습니다. 대기번호는 " + wait + "번입니다.");
                    System.out.println();

                    wait++; // 다음 대기 번호
                    break;

                case 2: //예약조회
                    System.out.print("대기번호 입력: ");
                    int search = scanner.nextInt();
                    if (search > 0 && search <= 10 && re[search - 1] != null) {
                        System.out.println(re[search - 1].toString());
                        System.out.println();
                    } else {
                        System.out.println("예약이 없습니다.");
                        System.out.println();
                    }
                    break;

                case 3: //종료
                    System.out.println("프로그램을 종료합니다.");
                    return;
                    //메소드 탈출~

                default:
                    System.out.println("다시 입력하세요.");
                    break;
            }

        }
    }
}