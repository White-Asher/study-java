package why_use_class_type_up_casting;
class Food{
    public void eat(){
        System.out.println("Food eat");
    }
}
class HardBar extends Food{
    @Override
    public void eat(){
        System.out.println("HardBar eat");
    }
}
class Soju extends Food{
    @Override
    public void eat(){
        System.out.println("Soju eat");
    }
}
class Person {
    public void personEat(Food somethingFood) {
//        somethingFood.eat();
        if (somethingFood instanceof HardBar) {
            somethingFood.eat();
        } else if (somethingFood instanceof Soju) {
            somethingFood.eat();
        }
//        타입이 많다면....
    }
}
//만약 업캐스팅을 안쓰면??


public class CastingTest{
    public static void main(String[] args){
        Person person  = new Person();
//        Food foodVal1 = new HardBar(); // 업캐스팅!
//        Food foodVal2 = new Soju(); // 업캐스팅!

//        person.personEat(foodVal1);
//        person.personEat(foodVal2);

        HardBar hardBar = new HardBar();
        Soju soju = new Soju();
        person.personEat(hardBar);
        person.personEat(soju);

    }
}


