package lab03;
import java.util.Scanner;
import static lab03.Utils.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 0;

        System.out.println("Введите размер массива:");
        int n = in.nextInt();

        Complex[] arr = new Complex[n];
        while (choice != 5) {
            menu();
            choice = in.nextInt();
            switch (choice) {
                case 1: arr = createArr(arr); break;
                case 2: printArr(arr); break;
                case 3: addElem(arr).printComplex(); break;
                case 4: multiplyElem(arr).printComplex(); break;
                case 5: System.exit(0); break;
                default: System.out.println("Попробуйте еще раз"); break;

                }
            }
    }
}
