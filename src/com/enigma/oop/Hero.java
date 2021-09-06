package com.enigma.oop;

public class Hero {

    private String name;
    private Integer hp;
    private Integer baseDamage;

    public Hero(String name, Integer hp, Integer baseDamage){
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    // Hero bisa menjadi parameter, sebenarnya sama konsepnya seperti String
    public void attack (Hero hero) {
//        hero.hp -= this.baseDamage;
        hero.getHit(this.baseDamage);
    }

    public void getHit(Integer baseDamage){
        this.hp -= baseDamage;      // yg memanggil gethit adalah target hero (yg diserang)
        if (this.hp < 0) {
            this.hp = 0;
        }
    }


    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", baseDamage=" + baseDamage +
                '}';
    }
}
