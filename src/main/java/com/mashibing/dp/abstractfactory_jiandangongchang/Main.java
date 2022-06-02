package com.mashibing.dp.abstractfactory_jiandangongchang;

public class Main {
    public static void main(String[] args) {
        AbastractFactory f = new ModernFactory();

        Vehicle c = f.createVehicle();
        c.go();
        Weapon w = f.createWeapon();
        w.shoot();
        Food b = f.createFood();
        b.printName();

        AbastractFactory f2 = new MagicFactory();

        Vehicle broom = f2.createVehicle();
        broom.go();

    }
}
