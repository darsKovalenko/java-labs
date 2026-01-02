package lab02;
import java.util.Random;
import java.util.Scanner;
public class Program
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите размер матрицы:");
        int num = in.nextInt();

        int[][] numbers = new int[num][num];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers.length; j++)
            {
                numbers[i][j] = rand.nextInt(-num,num);
            }
        }

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers.length; j++)
            {
                System.out.print(numbers[i][j] + " " + '\t');
            }
            System.out.println();
        }

        System.out.println("Введите число: ");
        int k = in.nextInt();
        int count = 1;

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers.length; j++)
            {
                if (count != k + 1)
                {
                    System.out.print(count + " " + '\t');
                    count++;
                }
            }
            System.out.println();
        }
    }
}