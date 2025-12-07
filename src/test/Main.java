package test;
import exampleses.*;

public class Main{

    public static void main(String[] args) {
        String s = "This is John. He is 27 years old.";
        String name = s.substring(8, 12);
        int age = Integer.parseInt(s.substring(20, 22));
        Person person = new Person(name, age);
        System.out.println(person.getAge());
        System.out.println(person.getName());
}
}