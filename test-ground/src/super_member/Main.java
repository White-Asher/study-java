package super_member;
class Parent{
    int x = 10;
}
class Child extends Parent{
    int x = 20;
    void childMethod(){
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x); // 부모클래스의 멤버변수 x를 말하는것. 출력결과는 10 이다.
    }
}
class Main{
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
    }
}