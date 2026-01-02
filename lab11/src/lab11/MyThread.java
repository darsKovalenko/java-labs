package lab11;


public class MyThread extends Thread{
    private int threadNum;
    private BusStop[] busStops;
    private int busNumber;

    public MyThread(int threadNum, BusStop[] busStops){
        this.threadNum = threadNum;
        this.busStops = busStops;
        this.busNumber = threadNum;
    }
    public void run(){
        for (int i = 1; i <= Main.MAX_STOPS; i++){
            try {
                int stopNumber = i;
                BusStop busStop = busStops[stopNumber - 1];

                busStop.arriveAtBusStop(busNumber, stopNumber);
                Thread.sleep(500);

                busStop.leaveBusStop(busNumber, stopNumber);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
