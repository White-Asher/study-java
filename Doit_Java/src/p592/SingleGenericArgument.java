package p592;

class MyClass<T>{
    private T t;
    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }
}

public class SingleGenericArgument {
    public static void main(String[] args) {
        MyClass<String> mc1 = new MyClass<String>(); //String타입을 저장하거나 꺼내 올 수 있는 객체로 지정
        mc1.set("안녕");
        System.out.println(mc1.get());

        MyClass<Integer> mc2 = new MyClass<>(); //Integer타입을 저장하거나 꺼내올 수 있는 객체로 지정
        mc2.set(100);
        System.out.println(mc2.get());

//        MyClass<Integer> mc3 = new MyClass<>();
//        mc3.set("안녕"); // 강한 타입 체크로 문법 오류 발생
    }
}
