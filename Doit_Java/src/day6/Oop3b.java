package day6;

public class Oop3b {
    String bookName;
    int price;
    int dc;

    public Oop3b(){

    }
    public Oop3b(String bookName, int price){
        this.bookName = bookName;
        this.price = price;
    }

    public void discount(){
        if(price >=30000){
            dc = (int)(price*0.75);
        } else if(price >=20000){
            dc = (int)(price*0.80);
        } else {
            dc = (int)(price*0.85);
        }
    }
    public void print(){
        System.out.println(bookName+"의 정가는"+price+"할인된 가격은"+dc+"원 입니다.");
    }
}
