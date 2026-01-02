package lab10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lst list = new Lst();

        int choice = 0;
        while (choice != 7){
            menu();
            choice = in.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Введите число, которое хотите добавить: ");
                    Integer num = in.nextInt();
                    list.add(num);
                }
                case 2 -> {
                    System.out.println("Введите число, которое хотите добавить: ");
                    Integer num = in.nextInt();
                    System.out.println("Введите индекс, куда хотите добавить число: ");
                    int index = in.nextInt();
                    list.addIndex(index, num);
                }
                case 3 -> {
                    System.out.println("Введите число, которое хотите удалить: ");
                    Integer num = in.nextInt();
                    list.deleteNum(num);
                }
                case 4 -> {
                    System.out.println("Введите индекс, откуда хотите удалить число: ");
                    int index = in.nextInt();
                    list.deleteIndex(index);
                }
                case 5 -> {
                    System.out.println("К какому числу хотите найти ближайшее: ");
                    Integer num = in.nextInt();
                    System.out.println(list.find(num));
                }
                case 6 -> list.printList();
                case 7 -> System.exit(0);
            }
        }
        in.close();
    }

    static void menu(){
        System.out.println("Выберите действие: ");
        System.out.println("1. Добавить число");
        System.out.println("2. Добавить число по индексу");
        System.out.println("3. Удалить число");
        System.out.println("4. Удалить число по индексу");
        System.out.println("5. Найти число наиболее близкое к заданному ");
        System.out.println("6. Посмотреть числа");
        System.out.println("7. Выход");
    }
}