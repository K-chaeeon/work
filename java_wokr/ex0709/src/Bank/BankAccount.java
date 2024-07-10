package Bank;

import javax.swing.plaf.PanelUI;

public class BankAccount {

    int num = 0; //# 이거 쓸라면 @

    public int cmb() {
    //    int num = 200;  //적으면 이걸로 입력됨 #
        System.out.println("잔액" + num);  //@ this.num으로 적어야함
        return num;

    }

    public void deposit(int a) {
        num += a;

    }

    public void withdraw(int a){
        num -= a;

    }

}
