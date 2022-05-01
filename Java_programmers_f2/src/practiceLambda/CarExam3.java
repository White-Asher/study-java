package practiceLambda;

import java.util.*;

public class CarExam3 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add( new Car("작은차",2,800,3) );
        cars.add( new Car("봉고차",12,1500,8) );
        cars.add( new Car("중간차",5,2200,0) );
        cars.add( new Car("비싼차",5,3500,1) );

// 익명  클래스
//        printCar(cars,
//                new CheckCar() {
//                    @Override
//                    public boolean test(Car car) {
//                        return car.capacity >=4 && car.price <50000;
//                    }
//                });

        // 람다
        CarExam3 carExam3 = new CarExam3();
        carExam3.printCar(cars,
                (Car car)->{
            return car.capacity >=4 && car.price <50000;
        } );
    }

    public static void printCar(List<Car> cars, CheckCar tester){
        for(Car car : cars){
            if (tester.test(car)) {
                System.out.println(car);
            }
        }
    }

    interface CheckCar{
        boolean test(Car car);
    }
}
