package multithreading;

import java.util.Random;



public class Main {

    static boolean winner = false;
public static void main(String[] args) {
    Random random = new Random();
    int number = random.nextInt(1_000_000_001);
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run(){
            int option;
            do{
                option = random.nextInt(1_000_000_001);
            } while(option != number);
            winner = true;
            System.out.println("Winner: " + option);
        }
    });
    thread1.start();

    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run(){
        for (int i = 0; i < 10_000_000; i++){
            if (winner) break;
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    });
    thread2.start();
    
}
}
