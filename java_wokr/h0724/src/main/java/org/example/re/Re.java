package org.example.re;
import java.util.Scanner;
public class Re {


    public class ReserSystem {

        private static Reser[] reser = new Reser[20];
        private static int index = 0;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1. 예약하기");
                System.out.println("2. 예약 확인하기 (관리자용)");
                System.out.println("3. 종료");
                System.out.print("메뉴 선택: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over

                switch (choice) {
                    case 1:
                        makeReservation(scanner);
                        break;
                    case 2:
                        checkReservation(scanner);
                        break;
                    case 3:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    default:
                        System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                }
            }
        }

        private static void makeReservation(Scanner scanner) {
            if (index >= 20) {
                System.out.println("더 이상 예약할 수 없습니다. 프로그램을 종료합니다.");
                System.exit(0);
            }

            System.out.print("이름 입력: ");
            String name = scanner.nextLine();
            System.out.print("전화번호 입력: ");
            String phoneNumber = scanner.nextLine();

            Reservation reser = new Reservation(index + 1, name, phoneNumber);
            reser[index++] = reser;

            System.out.println("예약이 완료되었습니다. 예약번호는 " + reser.getReservationNumber() + " 입니다.");
        }

        private static void checkReservation(Scanner scanner) {
            System.out.print("예약번호 입력: ");
            int reservationNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            boolean found = false;
            for (int i = 0; i < index; i++) {
                if (reservations[i].getReserNumber() == reserNumber) {
                    System.out.println("예약번호 " + reserNumber + "에 해당하는 정보: " + reservations[i].getName() + ", " + reservations[i].getPhoneNumber());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("해당 예약번호로 예약된 정보가 없습니다.");
            }
        }

    }

    static class Reservation {
        private int reserNumber;
        private String name;
        private String phone;

        public Reservation(int reserNumber, String name, String phone) {
            this.reserNumber = reserNumber;
            this.name = name;
            this.phone = phone;
        }

        public int getReservationNumber() {
            return reserNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phone;
        }
    }

}
