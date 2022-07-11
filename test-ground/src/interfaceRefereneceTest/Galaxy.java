package interfaceRefereneceTest;

public class Galaxy implements Phone{
    private int serialNumber;

    @Override
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void printYear() {
        System.out.println(YEAR);     //2021 출력
//        YEAR = 10;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}