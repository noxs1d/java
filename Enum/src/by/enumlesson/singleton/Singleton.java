package by.enumlesson.singleton;

import by.enumlesson.Car;

import java.util.concurrent.BlockingDeque;

public enum Singleton {
    INSTANCE;
    private BlockingDeque<Car> cars;

    Singleton(BlockingDeque<Car> cars) {
        this.cars = cars;
        //some code
    }
    // some methode
}
