package ch7.p362;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine){
            System.out.println("this is a FireEngine instatnce.");
        }

        if(fe instanceof Car){
            System.out.println("this is a Car instance");
        }

        if(fe instanceof Object){
            System.out.println("this is an object instance.");
        }
        System.out.println(fe.getClass().getName());
    }
}

class Car{}
class FireEngine extends Car{}
