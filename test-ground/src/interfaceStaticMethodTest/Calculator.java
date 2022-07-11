package interfaceStaticMethodTest;

public interface Calculator {

    default int multi(int x, int y){
        return  x*y;
    }

    static void print(int value){
        System.out.println(value);
    }
}
