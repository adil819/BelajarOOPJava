package com.enigma.oop;

public class Monster {

    private String name;
    private Integer hp;
    private Integer baseDamage;

    public Monster(String name, Integer hp, Integer baseDamage){
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }


    public void getHit(Hero hero){
        this.hp -= hero.getBaseDamage();
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", baseDamage=" + baseDamage +
                '}';
    }

}
