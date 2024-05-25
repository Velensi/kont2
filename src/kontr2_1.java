import java.util.Scanner;

public class kontr2_1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int year = -1;
    while (year <= 0) {
        System.out.print("Введите натуральное число (год): ");
        if (sc.hasNextInt())
            year = sc.nextInt();
        else {
            System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
            sc.nextLine();
        }
    }

    if (isLeapYear(year)) {
        System.out.println(year + " - високосный год");
    } else {
        System.out.println(year + " - невисокосный год");
    }
}

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
