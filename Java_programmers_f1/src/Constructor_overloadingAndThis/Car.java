package Constructor_overloadingAndThis;

public class Car {
    String name;
    int number;

    public Car(String name){
        this.name = name;

    }
    public Car(){
//        this.name = "이름없음";
//        this.number = 0;
//            name, number가 계속 나온다..
//        this를 사용하자.
        this("이름없음",0);
//        this괄호 하면 자신의 생성자를 호출함..

    }

    public Car(String name, int number){
        this.name = name;
        this.number = number;
//        this(name,number); 도 가능함.
    }

}
