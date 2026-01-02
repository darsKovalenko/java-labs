package lab06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CargoFlight cargoFlight = new CargoFlight(111, "Minsk", "Boeing 737-800", " загружается", 4.33, 1560, 1, "Стройматериалы" );
        PassFlight passFlight = new PassFlight(272, "Astana", "Embraer 195-E2", "в ремонте", 5.12, 1000, 3, 125);
        System.out.println("С каким рейсом хотите работать? \n1.Грузовой 2.Пассажирский");
        int ch = in.nextInt();
        if (ch == 1) {
            int choice = 0;
            while (choice != 14){
               lab06.Utils.menu(1);
               choice = in.nextInt();
                switch (choice) {
                    case 1 -> cargoFlight.getInfo();
                    case 2 -> {
                        System.out.println("Введите новый номер рейса: ");
                        int num = in.nextInt();
                        cargoFlight.changeNumFlight(num);
                    }
                    case 3 -> {
                        System.out.println("Введите новый пункт назначения: ");
                        String dest = in.next();
                        cargoFlight.changeDestination(dest);
                    }
                    case 4 -> {
                        System.out.println("Введите новую марку судна: ");
                        String brand = in.next();
                        cargoFlight.changeBrand(brand);
                    }
                    case 5 -> {
                        System.out.println("Введите цифру, которая соответствует статусу рейса: ");
                        System.out.println("1.Загружается\n2.Разгружается\n3.На заправке\n4.В пути\n5.В ремонте\n6.Готов к вылету\n7.Требуется ремонт");
                        int numStatus = in.nextInt();
                        cargoFlight.changeStatus(numStatus);
                    }
                    case 6 -> {
                        System.out.println("Снаряженная масса судна: " + cargoFlight.getWeight());
                    }
                    case 7 -> {
                        System.out.println("Количество топлива: " + cargoFlight.getFuel());
                    }
                    case 8 -> {
                        cargoFlight.sendToDestination();
                    }
                    case 9 -> {
                        cargoFlight.repair();
                    }
                    case 10 -> {
                        cargoFlight.refuel();
                    }
                    case 11 -> {
                        System.out.println("Введите массу груза: ");
                        int num = in.nextInt();
                        cargoFlight.changeWeight(num);
                    }
                    case 12 -> {
                        System.out.println("Ценность груза: " + cargoFlight.getCargoValue());
                    }
                    case 13 ->{
                        System.out.println("Введите новый тип груза: ");
                        String type = in.next();
                        cargoFlight.changeTypeCargo(type);
                    }
                    case 14 -> {
                        System.exit(0);
                    }
                    default -> System.out.println("Попробуйте еще раз");
                }
            }
        }
        else if (ch == 2) {
            int choice = 0;
            while (choice != 14){
                lab06.Utils.menu(2);
                choice = in.nextInt();
                switch (choice) {
                    case 1 -> passFlight.getInfo();
                    case 2 -> {
                        System.out.println("Введите новый номер рейса: ");
                        int num = in.nextInt();
                        passFlight.changeNumFlight(num);
                    }
                    case 3 -> {
                        System.out.println("Введите новый пункт назначения: ");
                        String dest = in.next();
                        passFlight.changeDestination(dest);
                    }
                    case 4 -> {
                        System.out.println("Введите новую марку судна: ");
                        String brand = in.next();
                        passFlight.changeBrand(brand);
                    }
                    case 5 -> {
                        System.out.println("Введите цифру, которая соответствует статусу рейса: ");
                        System.out.println("1.Загружается\n2.Разгружается\n3.На заправке\n4.В пути\n5.В ремонте\n6.Готов к вылету\n7.Требуется ремонт");
                        int numStatus = in.nextInt();
                        passFlight.changeStatus(numStatus);
                    }
                    case 6 -> {
                        System.out.println("Снаряженная масса судна: " + passFlight.getWeight());
                    }
                    case 7 -> {
                        System.out.println("Количество топливо: " + passFlight.getFuel());
                    }
                    case 8 -> {
                        passFlight.sendToDestination();
                    }
                    case 9 -> {
                        passFlight.repair();
                    }
                    case 10 -> {
                        passFlight.refuel();
                    }
                    case 11 -> {
                        System.out.println("Введите массу груза: ");
                        int num = in.nextInt();
                        passFlight.changeWeight(num);
                    }
                    case 12 -> {
                        System.out.println("Ценность груза: " + passFlight.getCargoValue());
                    }
                    case 13 -> {
                        System.out.println("Введите количество пассажиров: ");
                        int num = in.nextInt();
                        passFlight.changeNumberOfPass(num);
                    }
                    case 14 -> {
                        System.exit(0);
                    }
                    default -> System.out.println("Попробуйте еще раз");
                }
            }
        }
        in.close();
    }
}