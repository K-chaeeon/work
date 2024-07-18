package org.example.chap14;
//기본생성자(@@@@@@)는 다른생성자(&&&&&)를 선언하면 생략할 수 없음

//상속관계에서는 부모클래스 생성자는 무조건적으로 호출되어야한다(기본생성자, 다른생성자 등 모두)

//상속관계에서는 부모클래스의 기본생성자를 호출하는 게 있는데(super();) 생략되어있음

/*만약 부모클래스에 기본생성자( public Man(){})가 선언되어있지 않을 때는
 다른 생성자 호출(super(name);)을 통해 부모클래스 생성자를 호출할 수 있다. */

public class FriendMan extends Man {
    private String place;

    public FriendMan(String name, String place) {       //부모클래스인 Man에서 가져올 값을 호출해야함    //%%%%%%%%%%%%%%%%
        super(name);          //%%%%%%%%%%%%%%%%%%
        this.place = place;

    }

    public void good(){
        tellInfo();
        System.out.println("장소 = "+place);

    }

}
