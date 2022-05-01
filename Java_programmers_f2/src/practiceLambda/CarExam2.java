package practiceLambda;

import java.util.ArrayList;
import java.util.List;

//내부클래스 사용
public class CarExam2 {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("버스",40,160000,3));
        cars.add(new Car("봉고차", 12, 30000,5));
        cars.add(new Car("중고차",4,5000,10));
        cars.add(new Car("SUV",6,40000,2));

        printCar(cars , new CheckCarForBigAndNotExpensive());
    }

    public static void printCar(List<Car> cars, CheckCar tester){
        for(Car car : cars){
            if(tester.test(car)){
                System.out.println(car);
            }
        }
    }

    interface CheckCar{
        boolean test(Car car);
    }

    static class CheckCarForBigAndNotExpensive implements CheckCar{
        public boolean test(Car car){
            return car.capacity >= 4 && car.price <50000;
        }
    }
}
