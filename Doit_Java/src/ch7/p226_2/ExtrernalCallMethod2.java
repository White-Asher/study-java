package ch7.p226_2;
class A{
    void print(){
        System.out.println("hi");
    }
    int data(){
        return 3;
    }
    double sum(int a, double b){
        return a+b;
    }
    void printMonth(int m){
        if(m <0 || m>12){
            System.out.println("잘못된 입력");
            return;
        }
        System.out.println(m+"월 입니다");
    }
}
public class ExtrernalCallMethod2 {
    public static void main(String[] args) {
        A a = new A();
        a.print();
        int k = a. data();

        System.out.println(k);
        double result = a.sum(3,5.2);
        System.out.println(result);
        a.printMonth(5);
        a.printMonth(15);
    }
}
