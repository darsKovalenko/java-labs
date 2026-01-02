package lab04;

public class Utils {
    static void menu(){
        System.out.println("\nВыберите, что хотите сделать: ");
        System.out.println("1. Записать музыку на диск");
        System.out.println("2. Показать все композиции на диске ");
        System.out.println("3. Отсортировать по жанрам на диске");
        System.out.println("4. Показать всю продолжительность");
        System.out.println("5. Найти композицию по продолжительности ");
        System.out.println("6. Выход ");
    }

    static void findTrack(Track[] tracks, double time){
        for (int i = 0; i< tracks.length; i++){
            if (tracks[i].lenTrack == time){
                tracks[i].printTrack();
            }
        }
    }
}


