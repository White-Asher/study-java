package interfacePrivateMethodTest;

public interface Animal {
    void animalMethod();

    default void defaultAnimalMethod(){
        System.out.println("Default Animal Method");

        privateAnimalMethod();
        privateStaticAnimalMethod();

    }

    private void privateAnimalMethod(){
        System.out.println("private animal method");
    }

    private static void privateStaticAnimalMethod(){
        System.out.println("private static car method");
    }

}
