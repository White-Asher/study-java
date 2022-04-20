package ch16.p595;

class Banana{}
class Book{}

class Goods<T> {
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}

public class Solution2_Generic {
    public static void main(String[] args) {
        //1. Goods을 통해서 Banana 객체 추가 및 가져오기
        Goods<Banana> goods1 = new Goods<>();
        goods1.set(new Banana());
        Banana Banana = goods1.get(); //다운캐스팅 필요 없음

        //2. Goods을 통해서 Book 객체 추가 및 가져오기
        Goods<Book> goods2 = new Goods<>();
        goods2.set(new Book());
        Book Book = goods2.get();

        //3. 잘못된 타입선언
        Goods<Banana> goods3 = new Goods<>();
        goods3.set(new Banana());
		// Book Book2 = goods3.get(); //강한타입체크
    }
}