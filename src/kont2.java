import java.util.Scanner;

public class kont2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число, не меньшее 2: ");
        int number = scanner.nextInt();

        int smallestDivisor = 2;

        while (number % smallestDivisor != 0) {
            smallestDivisor++;
        }

        System.out.println("Наименьший натуральный делитель числа " + number + " (отличный от 1) равен " + smallestDivisor);
    }
}