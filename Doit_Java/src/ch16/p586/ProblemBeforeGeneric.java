package ch16.p586;
// Banana클래스와 Banana클래스를 담을 수 있는 Good1클래스
class Banana{}
class Goods1{
    private Banana banana = new Banana();
    public Banana getBanana(){
        return banana;
    }
    public void setBanana(Banana banana){
        this.banana = banana;
    }
}
// Book클래스와 Book클래스를 담을 수 있는 Good2클래스
class Book{}
class Goods2{
    private Book book = new Book();
    public Book getBook(){
        return book;
    }
    public void setBook(Book book){
        this.book = book;
    }
}

public class ProblemBeforeGeneric {
    public static void main(String[] args) {
        //Goods1을 이용해 Banana객체를 추가하거나 가져오기
        Goods1 goods1 = new Goods1();
        goods1.setBanana(new Banana()); //Banana타입만 입력 가능
        Banana banana = goods1.getBanana(); //Banana 타입 리턴

        //Goods2을 이용해 Book객체를 추가하거나 가져오기
        Goods2 goods2 = new Goods2();
        goods2.setBook(new Book()); //Book 타입만 입력 가능
        Book book = goods2.getBook(); //Book 타입 리턴
    }
}
