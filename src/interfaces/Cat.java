package interfaces;

public class Cat extends Animal implements ableToRun{
    @Override
    public void eat(){
    System.out.println("Кошачий корм");
    }

    @Override
    public void run(){
        System.out.println("Кот бежит");
    }
}
