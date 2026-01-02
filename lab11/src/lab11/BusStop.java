package lab11;

import java.util.concurrent.Semaphore;

public class BusStop {
    private Semaphore semaphore;
    private int maxBuses;

    public BusStop(Semaphore sem, int maxBuses) {
        this.semaphore = sem;
        this.maxBuses = maxBuses;
    }

    public void arriveAtBusStop(int busNumber, int stopNumber) throws InterruptedException {
        semaphore.acquire();
        System.out.printf("Автобус %d прибыл на остановку %d %n%n", busNumber, stopNumber);
    }

    public void leaveBusStop(int busNumber, int stopNumber) {
        System.out.printf("Автобус %d покинул остановку %d %n", busNumber, stopNumber);
        semaphore.release();
    }


}
