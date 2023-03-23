package web;


import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String nameCar;
    private final int serias;
    private final int spedTest;

    public Car(String nameCar, int serias, int spedTest) {
        this.nameCar = nameCar;
        this.serias = serias;
        this.spedTest = spedTest;
    }

    public String getNameCar() {
        return nameCar;
    }

    public int getSerias() {
        return serias;
    }

    public int getSpedTest() {
        return spedTest;
    }

    public static void main(String[] args) {

    }
    public static List<Car> getListCars() {
        List<Car> messages = new ArrayList<>();
        messages.add(new Car("asdawad",1,80));
        messages.add(new Car("fddd",5,70));
        messages.add(new Car("ddds",12,68));
        messages.add(new Car("dd12e31ds",1,61));
        messages.add(new Car("ddfdfgdds",14,76));
        return messages;
    }}
