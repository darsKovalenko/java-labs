package lab07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите две строки: ");
        String str1 = in.next();
        String str2 = in.next();

        LongerString longerString = (String s1,String s2)->{
            if (s1.length() < s2.length()){
                return s2;
            }
            else if (s1.length() > s2.length()) {
                return s1;
            }
            else {
                return "Строки равны";
            }
        };

        System.out.println(longerString.compare(str1,str2));
        in.close();
    }
}