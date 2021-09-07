package com.enigma.oop;

public class Tower implements Hitable {

    private Integer hp;

    public Tower(Integer hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "hp=" + hp +
                '}';
    }

    @Override
    public void receiveDamage(Hero hero) {
        this.hp -= hero.getBaseDamage();
    }
}
