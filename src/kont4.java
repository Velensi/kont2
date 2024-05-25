import java.util.Scanner;
public class kont4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число для вычисления факториала: ");
    int number = scanner.nextInt();

    long factorial = calculateFactorial(number);

    System.out.println("Факториал числа " + number + " равен: " + factorial);
}

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Факториал 0 равен 1
        } else {
            return n * calculateFactorial(n - 1); // Рекурсивный вызов для вычисления факториала
        }
    }
}