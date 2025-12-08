package test;

import inheritance.Cat;
import inheritance.Lion;

public class Main{
public static void main(String[] args) {
   Cat cat = new Cat();
   Lion lion = new Lion();

   System.out.println(cat.eat());
   System.out.println(lion.eat());
   
}
}