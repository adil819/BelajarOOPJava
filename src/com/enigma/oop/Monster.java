package com.enigma.oop;

public class Monster implements Hitable {

    private String name;
    private Integer hp;
    private Integer baseDamage;

    public Monster(String name, Integer hp, Integer baseDamage){
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    @Override
    public void receiveDamage(Hero hero) {
        this.hp -= hero.getBaseDamage();
    }


//    public void getHit(Hero hero){
//        this.hp -= hero.getBaseDamage();
//    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", baseDamage=" + baseDamage +
                '}';
    }

}
