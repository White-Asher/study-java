package interfaceRefereneceTest;

public class Dog implements Animal{
    @Override
    public void cry(){
        System.out.println("멍멍!");
    }

    public void name(){
        System.out.println("milk");
    }
}
