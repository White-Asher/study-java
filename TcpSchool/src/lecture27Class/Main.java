package lecture27Class;

import java.util.Scanner;

class Car{
    private String modelName;
    private int modelYear;

    Car(String modelName, int modelYear){
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    public String getModel(){
        return this.modelYear + "년식" + this.modelName;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputCarModelName = scanner.nextLine();
        int inputCarModelYear = scanner.nextInt();

        Car car = new Car(inputCarModelName, inputCarModelYear);
        System.out.println(car.getModel());
    }
}
