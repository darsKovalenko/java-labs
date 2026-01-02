package lab06;

public interface Flight {
    void getInfo();
    void changeNumFlight(int num);
    void changeDestination(String destination);
    void changeBrand(String brand);
    void changeStatus(int status);
    double getTime();
    double getWeight();
    double getFuel();
    void sendToDestination();
    void repair();
    void refuel();
    void changeWeight(double weight);
    int getCargoValue();
}
