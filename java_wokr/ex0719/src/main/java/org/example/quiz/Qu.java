package org.example.quiz;
/*
 다음 클래스 각각에 적절한 생성자를 삽입해보자. 물론 상속 관계를 고려하여 각 클래스 별로
 필요한 생성자를 삽입해야 한다.
 */
/*
public class Car {
    int gasolineGauge;
}

class HybridCar extends Car{
    int electricGauge;
}

class HybridWaterCar extends HybridCar{
    int waterGauge;
    public void showCurrentGauge(){
        System.out.println("잔여 가솔린 "+gasolineGauge);
        System.out.println("잔여 전기량 "+electricGauge);
        System.out.println("잔여 워터량 "+waterGauge);
    }
}
*/
/*
Car는 가솔린으로 동작하는 자동차를 표현한 것이고, HybridCar는 가솔린과 전기로 동작하는
자동차를 표현한 것이다. 그리고 HybridWaterCar는 가솔린과 전기뿐 아니라, 물도 동시에
연료로 사용할 수 있는 꿈의 자동차를 표현한 것이다. 그러나 이 문제는 위의 클래스들이
의미하는 바를 몰라도 해결이 가능하다.
 */

public class Qu {

    public class Car {
        int gasolineGauge;

        int electronicGauge;
        int waterGauge;


    }

    class HybridCar extends Car {
        int electricGauge;

        public HybridCar(int hc) {

        }

        public HybridCar() {

        }
    }

    class HybridWaterCar extends HybridCar {
        int waterGauge;

        public HybridWaterCar(){}

        public HybridWaterCar(int hc, int hwc) {
            super();
            super.gasolineGauge = gasolineGauge;
            super.electricGauge = electronicGauge;
        }

        public void showCurrentGauge(int hc, int hwc) {

            System.out.println("잔여 가솔린 " + gasolineGauge);
            System.out.println("잔여 전기량 " + electricGauge);
            System.out.println("잔여 워터량 " + waterGauge);

        }
    }

    public void main(String[] args) {

        HybridCar hybridCar = new HybridCar(200);
        HybridWaterCar hybridWaterCar = new HybridWaterCar(456);


    }


}

//    class Car {      //부모
//
//        int gasolineGauge;
//
//        public Car(int car1) {
//            this.gasolineGauge = car1;
//        }
//
//
//        public Car() {
//
//        }
//    }
//
//
//    class HybridCar extends Car {
//
//        int electricGauge;
//
//        public HybridCar(int car1) {
//            this.electricGauge = car1;
//        }
//
//        public HybridCar() {
//
//        }
//    }
//
//
//    class HybridWaterCar extends HybridCar {
//
//        int waterGauge;
//
//        public HybridWaterCar(int car1, int car2) {
//            super(car1);
//            this.waterGauge = car2;
//
//        }
//
//
//        public void showCurrentGauge(int car1, int car2, int car3) {
//
//
//            System.out.println("잔여 가솔린 " + gasolineGauge);
//            System.out.println("잔여 전기량 " + electricGauge);
//            System.out.println("잔여 워터량 " + waterGauge);
//        }
//    }
//
//    public void main(String[] args) {
//
//        HybridWaterCar car3 = new HybridWaterCar();
//
//        car3.showCurrentGauge();
//
//
//    }



