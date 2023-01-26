package com.example.myapplication;

class Animall{
 void eat() (system.out.println("eating...");}
 
    }
 class Dog1 extends Animall{
  void bark() {System.out.println("barking...");}
   }
   public class TestInheritance1{
    public static void main (String args[]){
     Dog1 d=new Dog1();
     d.bark();
     d.eat();
}
