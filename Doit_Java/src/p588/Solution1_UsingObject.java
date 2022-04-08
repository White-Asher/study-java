package p588;

class Banana{}
class Book{}

// Banan, Book클래스를 모두 담고 꺼낼 수 있는 클래스
class Goods{
    private Object object = new Object();
    public Object getObject(){
        return object;
    }
    public void setObject(Object object){
        this.object = object;
    }
}

public class Solution1_UsingObject {
    public static void main(String[] args) {
        //Goods1을 이용해 Banana객체를 추가하거나 가져오기
        Goods goods1 = new Goods();
        goods1.setObject(new Banana());
        Banana banana = (Banana)goods1.getObject();

        //Goods2을 이용해 Book객체를 추가하거나 가져오기
        Goods goods2 = new Goods();
        goods2.setObject(new Book());
        Book book = (Book)goods2.getObject();

        //3. 잘못된 캐스팅 (약한 타입체크)
//		Goods goods3 = new Goods();
//		goods3.setObject(new Apple());
//		Pencil pencil2 = (Pencil)goods3.getObject(); //실행예외
    }
}
