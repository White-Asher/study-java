package practiceLambda;

import java.util.ArrayList;
import java.util.List;

public class CarExam1 {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("버스",40,160000,3));
        cars.add(new Car("봉고차", 12, 30000,5));
        cars.add(new Car("중고차",4,5000,10));
        cars.add(new Car("SUV",6,40000,2));

        printCarCheaperThan(cars, 50000);
    }

    public static void printCarCheaperThan(List<Car> cars, int price){
        for(Car car : cars){
            if(car.price< price){
                System.out.println(car);
            }
        }
    }
}
