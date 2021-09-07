package com.enigma.oop;

public class Hero implements Hitable {

    private String name;
    private Integer hp;
//    private static Integer hp;  // HATI HATI PENGGUNAAN STATIC
    private Integer baseDamage;

    public Hero(String name, Integer hp, Integer baseDamage){
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    // Hero bisa menjadi parameter, sebenarnya sama konsepnya seperti String
    public void attack (Hitable hitable) {
//        hero.hp -= this.baseDamage;
        hitable.receiveDamage(this);
    }

    @Override
    public void receiveDamage(Hero hero) {
        this.hp -= hero.getBaseDamage();
    }

    //    public void attack (Monster monster) {
//        monster.getHit(this);
//    }
//
//    public void attack (Tower tower) {
//        tower.receiveDamage(this.baseDamage);
//    }
//
//    public void getHit(Integer baseDamage){
//        this.hp -= baseDamage;      // yg memanggil gethit adalah target hero (yg diserang)
//        if (this.hp < 0) {
//            this.hp = 0;
//        }
//    }

    public Integer getBaseDamage() {
        return baseDamage;
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
