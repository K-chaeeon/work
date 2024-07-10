package ex0710.src.bank;

public class BankAccountMain {

//    public static void checkMyBalance() {
//    }

    public static void main(String[] args) {
        System.out.println("시작");
//constructor=생성자
        BankAccount park = new BankAccount("박길동","1234","950713", 50000);  //메모리화=인스턴스 생성
        BankAccount yoon = new BankAccount("윤길동","5678","950719", 50000);     //@@@

//        park.initAccount("1234","950713", 50000);
//        yoon.initAccount("5678","950719", 50000);

        park.cmb();
        yoon.cmb();

        park.deposit(3000);
        yoon.deposit(4000);

        park.cmb();
        yoon.cmb();

        park.withdraw(1000);
        yoon.withdraw(2000);

        park.cmb();
        yoon.cmb();

        System.out.println("끝");
    }
}
