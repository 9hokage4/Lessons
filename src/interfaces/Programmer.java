package interfaces;

public class Programmer implements Drive, Work{
    
    @Override
    public void drive(){
        System.out.println("Программист водит машину.");
    }

    @Override
    public void work(){
        System.out.println("Программист работает");
    }
}
