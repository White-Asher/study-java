package day6;

public class Oop3a {
    public static void main(String[] args) {
        Oop3b obj = new Oop3b();
        Oop3b java = new Oop3b("java",30000);
        Oop3b jsp = new Oop3b("jsp",25000);
        Oop3b oracle = new Oop3b("oracle",15000);

        java.discount();
        java.print();

    }
}
