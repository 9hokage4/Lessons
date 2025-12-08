package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Director director = new Director();
        Cook cook = new Cook();

        ArrayList<Drive> drivers = new ArrayList<>();
        drivers.add(programmer);
        drivers.add(cook);

        ArrayList<Work> worker = new ArrayList<>();
        worker.add(programmer);
        worker.add(cook);
        worker.add(director);

        for (Drive drive : drivers) drive.drive();
        for (Work work : worker) work.work();
    }
}
