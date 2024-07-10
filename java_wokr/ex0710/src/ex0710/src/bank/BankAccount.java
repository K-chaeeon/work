package ex0710.src.bank;

public class BankAccount {                          //####

    int num = 0; //# 이거 쓸라면 @
    String name = "";
    String accNumber = "";
    String ssNumber = "";
    //값을 안 넣으면(= "" 안쓰면) null출력됨

    BankAccount() {
    }                   //->기본생성자.생략되어있음

    BankAccount(String na,String acc, String ss,int n) {    //@@@
        name = na;
        accNumber = acc;
        ssNumber = ss;
        num = n;                                //####
    }


    public void initAccount(String acc, String ss,int n){
        accNumber = acc;
        ssNumber = ss;
        num = n;
    }


    public void cmb() {
        //    int num = 200;  //적으면 이걸로 입력됨 #
        System.out.println("====================");
                System.out.println("계좌번호 = " + accNumber);
        System.out.println("주민번호 = " + ssNumber);
        System.out.println("이름 " + name + " / 잔액" + num);  //@ this.num으로 적어야함
        System.out.println("====================");
        System.out.println();
    }


    public void deposit(int a) {
        num += a;

    }

    public void withdraw(int a) {
        num -= a;

    }

}
