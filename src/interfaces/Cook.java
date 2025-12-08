package interfaces;

public class Cook implements Drive, Work {
    @Override
    public void drive(){
        System.out.println("Повар водит машину.");
    }

    @Override
    public void work(){
        System.out.println("Повар работает");
    }
}
