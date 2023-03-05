package Rikkei.academy.TH2;

import Rikkei.academy.TH2.Car;

public class TH2_StaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Vin Fast", "VF6");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Vin Fast", "VF8");
        System.out.println(Car.numberOfCars);
    }
}
