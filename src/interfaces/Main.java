package interfaces;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        
        director.force(new Work(){
            @Override
            public void work(){
                System.out.println("Работает");
            }
        });
    }
}
