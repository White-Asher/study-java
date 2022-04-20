package ch8.p273test;
import ch8.p273packagetest.*;
public class PackageImport_2 {
    public static void main(String[] args) {
        packtest a = new packtest();

        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}
