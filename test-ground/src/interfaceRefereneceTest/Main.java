package interfaceRefereneceTest;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();

        Dog dog2 = new Dog();
        Cat cat2 = new Cat();

        dog1.cry();
        cat1.cry();

        // dog1.name() // error!
        // cat1.name() // error!

        ((Dog)dog1).name();
        ((Cat)cat1).name();

        dog2.cry();
        cat2.cry();

        dog2.name();
        cat2.name();
        // 도데체 무슨 장점이 있는 것인가...????
    }
}
