package chapter_7_Problem.pro7;

class A { int m = 3; int n = 5; void abc(int m, int n) { m = this.m; n = n;
} }

public class problem7 {
    public static void main(String[] args) {
        A a = new A(); a.abc(7, 8); System.out.println(a.m); System.out.println(a.n);
    }


}
