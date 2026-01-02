package lab06;

public class CargoFlight extends FlightData{
    private String typeCargo;
    public CargoFlight(int numFlight, String destination, String brand, String status, double time, double fuel, int cargoValue, String typeCargo){
        super(numFlight, destination, brand, status, time, fuel,cargoValue);
        this.typeCargo = typeCargo;
    }

    public void changeTypeCargo(String type){
        this.typeCargo = type;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Тип груза: "+typeCargo);
    }
}
