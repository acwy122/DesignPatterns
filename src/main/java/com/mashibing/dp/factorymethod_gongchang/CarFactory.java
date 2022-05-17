package com.mashibing.dp.factorymethod_gongchang;

public class CarFactory {
    public Moveable create() {
        System.out.println("a car created!");
        return new Car();
    }
}
