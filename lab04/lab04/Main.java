package lab04;
import static lab04.Utils.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        CD disk = new CD();
        int choice = 0;

        while (choice != 6){
            menu();
            choice = in.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("Сколько композиций хотите записать на диск? ");
                    int num = in.nextInt();
                    disk = new CD(num);
                } break;
                case 2: disk.printCD(); break;
                case 3: disk.sortTracks(); disk.printCD(); break;
                case 4: disk.printSumLen(); break;
                case 5: {
                    System.out.println("Какой длительности вы хотите найти композицию? ");
                    double len = in.nextDouble();
                    findTrack(disk.tracks, len);
                } break;
                case 6: System.exit(0); break;
            }
        }
        in.close();
    }
}
