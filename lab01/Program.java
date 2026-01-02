import java.util.Scanner;
//класс поместить в пакет
public class Program
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int num = in.nextInt();

        int numbers[] = new int[num];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = in.nextInt();
        }

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > 99 && numbers[i] < 1000)
            {
                int num1 = numbers[i] / 100;
                int num2 = (numbers[i] % 100) / 10;
                int num3 = numbers[i] % 10;

                if (num1 != num2 && num1 != num3 && num2 != num3)
                {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
