package com.mashibing.dp.abstractfactory_jiandangongchang;


/**
 * 抽象工厂
 * （道生一  一生二  二生三   三生世界）
 *
 * 统一的工厂
 */
public abstract class AbastractFactory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}
