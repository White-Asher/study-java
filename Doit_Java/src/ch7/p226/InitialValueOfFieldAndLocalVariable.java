package ch7.p226;

class A{
    boolean m1;
    int m2;
    double m3;
    String m4;
    void printFieldValue(){
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }
    void printLocalValue(){
        int k;
        k=3;
        System.out.println(k);
    }
}
public class InitialValueOfFieldAndLocalVariable {
    public static void main(String[] args) {
        A a  = new A();
        a.printFieldValue();
        a.printLocalValue();
    }
}
