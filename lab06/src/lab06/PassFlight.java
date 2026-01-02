package lab06;

public class PassFlight extends FlightData{

    private int numberOfPass;
    public PassFlight(int numFlight, String destination, String brand, String status, double time, double fuel, int cargoValue, int numberOfPass){
        super(numFlight, destination, brand, status, time, fuel,cargoValue);
        this.numberOfPass = numberOfPass;
    }
    public void changeNumberOfPass(int num){
        this.numberOfPass = num;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Количество пассажиров: "+numberOfPass);
    }

}
