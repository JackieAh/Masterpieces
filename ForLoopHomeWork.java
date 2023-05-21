import java.util.Scanner;
import static java.lang.Math.sqrt;

public class ForLoopHomeWork {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 100 that are aliquot to 7 are: ");
        aliquotSeven();
        aliquotSumThreeFive();
        sumSquare();
        natInteger();

    }

    // Напишите программу, которая выводит на экран все числа от 1 до 100, кратные 7
    public static void aliquotSeven() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Напишите программу, которая вычисляет сумму всех чисел от 1 до 50, которые делятся на 3 и 5 одновременно.
    public static void aliquotSumThreeFive() {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of numbers between 1 and 50 that are aliquot to 3 and 5 are: " + sum + " ");
    }

    // Напишите программу, которая вычисляет сумму всех чисел от 1 до 1000, которые являются точными квадратами.
    //-точный квадрат - квадрат целого числа (4, 9, 16, 25 и тд)
    public static void sumSquare() {
        int sum = 0;
        int i;
        for (i = 1; i <= 1000; i++) {
            if (sqrt(i) % 1 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of numbers between 1 and 50 that are aliquot to 3 and 5 (" + i + ")" + " are: " + sum + " ");
    }
// Напишите программу, которая принимает число вычисляет сумму всех простых чисел, которые меньше этого числа

    public static void natInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int sum = 0;
        int i;
        int number = scanner.nextInt();
        for (i= number; i <= number; i--) {
            if (number % 1 == 0 && number % number == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of all nat int that are lower than the given number (" + number + ")" + " is: " + sum + " ");
    }
}