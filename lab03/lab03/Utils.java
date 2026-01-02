package lab03;
import java.util.Scanner;

public class Utils {
    static void menu(){
        System.out.println("1.Заполнить массив векторов");
        System.out.println("2.Вывести массив на экран");
        System.out.println("3.Сложить элементы массива");
        System.out.println("4.Перемножить элементы массива");
        System.out.println("5.Завершить программу");
    }

    static Complex[] createArr(Complex[] arr) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Вектор : " + (i + 1));

            float reM, reN, imM, imN;
            System.out.println("Введите m и n для действительной части (m/n): ");
            reM = in.nextInt();
            while ((reN = in.nextInt()) == 0) {
                System.out.println("Попробуйте еще раз ввести n ");
            }
            ;
            System.out.println("Введите m и n для мнимой части (m/n): ");
            imM = in.nextInt();
            while ((imN = in.nextInt()) == 0) {
                System.out.println("Попробуйте еще раз ввести n ");
            }
            
            arr[i] = new Complex(reM, reN, imM, imN);
        }
        return arr;
    }
    static void printArr(Complex[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].printComplex();
        }
    }
    static Complex addElem(Complex[] arr){
        Complex sum = new Complex();
        for (int i = 0; i < arr.length; i++) {
            sum = sum.add(arr[i]);
        }
        return sum;
    }
    static Complex multiplyElem(Complex[] arr){
        Complex multi = new Complex();
        multi.re = new Fraction(arr[0].re.m, arr[0].re.n);
        multi.im = new Fraction(arr[0].im.m, arr[0].im.n);

        for (int i = 1; i < arr.length; i++) {
            multi = multi.multiply(arr[i]);
        }
        return multi;
    }
}
