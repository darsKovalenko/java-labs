package lab06;

public abstract class FlightData implements Flight{
    private int numFlight;
    private String destination;
    private String brand;
    private String status;// "загружается, разгружается, на заправке, в пути, в ремонте, готов к вылету, требуется ремонт"
    private double time;
    private double weight = 0;
    private double fuel;
    private int cargoValue; // 0-нулевая ценность, 1-средняя, 2-ценный груз, 3-люди
    public FlightData(int numFlight, String destination, String brand, String status, double time, double fuel, int cargoValue){
        this.numFlight = numFlight;
        this.destination = destination;
        this.brand = brand;
        this.status = status;
        this.time = time;
        this.fuel = fuel;
        this.cargoValue = cargoValue;
    }
    @Override
    public void getInfo(){
        System.out.println("\nНомер рейса: "+numFlight);
        System.out.println("Пункт назначения: "+destination);
        System.out.println("Марка судна: "+brand);
        System.out.println("Статус: "+status);
        System.out.println("Время полета: "+time);
        System.out.println("Масса груза: "+weight);
        System.out.println("Количество топлива: "+fuel);
        System.out.println("Ценность груза: "+cargoValue);
    }

    @Override
    public void changeNumFlight(int num) {
        this.numFlight = num;
    }

    @Override
    public void changeDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void changeBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void changeStatus(int status) {
        switch (status){
            case 1: this.status = " Загружается"; break;
            case 2: this.status = " Разгружается"; break;
            case 3: this.status = " На заправке"; break;
            case 4: this.status = " В пути"; break;
            case 5: this.status = " В ремонте"; break;
            case 6: this.status = " Готов к вылету"; break;
            case 7: this.status = " Требуется ремонт"; break;
            default: System.out.println("Попробуйте еще раз"); break;
        }
    }

    @Override
    public double getTime() {
        return time;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getFuel() {
        return fuel;
    }

    @Override
    public void sendToDestination() {
        this.status = " в пути";
        System.out.println("Рейс с номер "+ this.numFlight+this.status);
    }

    @Override
    public void repair() {
        this.status = " в ремонте";
        System.out.println("Рейс с номер "+ this.numFlight+this.status);
        this.status = " готов к вылету";
        System.out.println("Рейс с номер "+ this.numFlight+this.status);
    }
    @Override
    public void refuel() {
        this.status = " на заправке";
        System.out.println("Рейс с номер "+ this.numFlight+this.status);
        this.status = " готов к вылету";
        System.out.println("Рейс с номер "+ this.numFlight+this.status);
    }

    @Override
    public void changeWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int getCargoValue() {
        return cargoValue;
    }
}
