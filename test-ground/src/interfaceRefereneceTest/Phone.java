package interfaceRefereneceTest;

public interface Phone {
    //컴파일러가 public static final을 붙혀 컴파일함
    //반드시 상수 선언
    int YEAR = 2021;

    //추상 메소드
    void setSerialNumber(int serialNumber);
}