package test;

import inheritance.*;

public class Main{
public static void main(String[] args) {
   Rect rect = new Rect(10, 20);
   Triangle triangle = new Triangle(10, 10, 10);
   triangle.showPerimeter();
   rect.showPerimeter();
}
}