package lab11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {
    public static int MAX_BUSES = 3;
    public static int MAX_STOPS = 5;
      public static void main(String[] args) {

        BusStop[] busStops = new BusStop[MAX_STOPS];
        Semaphore sem = new Semaphore(MAX_BUSES, true);

        for (int i = 0; i < MAX_STOPS; i++) {
            busStops[i] = new BusStop(sem, MAX_BUSES);
        }
        for (int i = 1; i <= Main.MAX_BUSES; i++){
            MyThread thread = new MyThread(i, busStops);
            thread.start();
        }

    }

}