package com.enigma.oop;

public class Car {

   public String color; // String dan Integer merupakan object yang disediakan oleh java, karena pada dasarnya semua yang ada di java merupakan objek
   private Integer fuel; // coba ctrl+click, pasti bisa diklik karena "Integer" merupakan object, beda dengan "int"
   public Integer year;

   // ALT + INSERT
   public Car(String color, Integer fuel){  // constructor => shortcut nya alt+insert
      this.color = color;  // selain utk constructor, "this" sering digunakan untuk interaksi antar objek
      this.fuel = fuel;
   }

   public Car() {

   }

   public void engineStart(){
      if(this.fuel > 0){
         System.out.println("Brum brum");
      } else {
         System.out.println("Insufficient fuel");
      }
   }

   public void fillFuel(int fuel){
      this.fuel += fuel;
   }



   @Override   // replace hashcode ketika sout objek class
   public String toString() {
      return "Car{" +
              "color='" + color + '\'' +
              ", fuel=" + fuel +
              ", year=" + year +
              '}';
   }
}
