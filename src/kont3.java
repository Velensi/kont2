import java.util.Scanner;

public class kont3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ввод координат трех вершин треугольника
        System.out.println("Введите координаты вершины A (x1 y1):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Введите координаты вершины B (x2 y2):");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Введите координаты вершины C (x3 y3):");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Вычисление длин сторон треугольника и периметра
        double sideAB = calculateDistance(x1, y1, x2, y2);
        double sideBC = calculateDistance(x2, y2, x3, y3);
        double sideCA = calculateDistance(x3, y3, x1, y1);
        double perimeter = sideAB + sideBC + sideCA;

        System.out.println("Периметр треугольника: " + perimeter);
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
