package lab04;

import java.util.Scanner;

public class CD {

    static int memory = 200000;
    public int num;
    public Track[] tracks;
    public int sumLen;
    public CD(){
        this.num = 0;
        this.tracks = new Track[num];

    }
    public CD(int num){
        this.num = num;
        this.tracks = new Track[num];
        this.tracks = setCD(num);
    }

    public Track[] setCD(int num){
        Scanner in = new Scanner(System.in);
        Track[] tracks = new Track[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Какого жанра композицию хотите записать? \n1. Классика\n2. Рок \n3. Поп \n");
            int numGenre = in.nextInt();

            String author = " ";
            System.out.println("Хотите добавить автора композиции? \n 1.Да 2.Нет");
            int choice = in.nextInt();
            if (choice == 1) {
                System.out.println("Введите автора композиции: ");
                author = in.next();
            }
            System.out.println("Введите длительность композиции: ");
            int len = in.nextInt();
            this.sumLen += len;
            if (sumLen > memory) {
                System.out.println("Диск переполнен!");
                break;
            }
            else {
                switch (numGenre) {
                    case 1 -> {
                        if (choice == 1) {
                            tracks[i] = new ClassicTrack(len, author);
                        } else {
                            tracks[i] = new ClassicTrack(len);
                        }
                    }
                    case 2 -> {
                        if (choice == 1) {
                            tracks[i] = new RockTrack(len, author);
                        } else {
                            tracks[i] = new RockTrack(len);
                        }
                    }
                    case 3 -> {
                        if (choice == 1) {
                            tracks[i] = new PopTrack(len, author);
                        } else {
                            tracks[i] = new PopTrack(len);
                        }
                    }
                    default -> System.out.println("Попробуйте еще раз");
                }
            }
            System.out.println("!Композиция записана на диск!");
        }
        //in.close();
        return tracks;
    }

    public void printCD(){
        if (tracks.length ==0){
            System.out.println("Композиций на диске нет. Попробуйте еще раз");
        }
        else {
            for (int i = 0; i < num; i++){
                tracks[i].printTrack();
            }
        }
    }
    public void printSumLen(){
        System.out.printf("На диске записано %d секунд \n", this.sumLen);
    }

    public void sortTracks(){
        Track[] sortTracks = new Track[this.tracks.length];
        int k = 0;
        for (int i = 0; i< this.tracks.length; i++){
            if (this.tracks[i].genre.equals("Классика")){
                sortTracks[k] = this.tracks[i];
                k++;
            }
        }
        for (int i = 0; i< this.tracks.length; i++){
            if (this.tracks[i].genre.equals("Рок")){
                sortTracks[k] = this.tracks[i];
                k++;
            }
        }
        for (int i = 0; i< this.tracks.length; i++){
            if (this.tracks[i].genre.equals("Поп-музыка")){
                sortTracks[k] = this.tracks[i];
                k++;
            }
        }

        tracks = sortTracks;

    }
}
