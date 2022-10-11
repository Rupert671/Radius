import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите радиус окружности в сантиметрах:");
        int radius = sc.nextInt();

        double area = calculateCircleArea(radius);
        double length = calculateCircleLength(radius);

        System.out.println("Площадь круга: " + area + " см.кв");
        System.out.println("Длина окружности: " + length + " см");

    }

    public static double calculateCircleArea(int radius) {
        final double PI = 3.14;
        return PI * radius * radius;
    }

    public static double calculateCircleLength(int radius) {
        final double PI = 3.14;
        return 2 * PI * radius;
    }
}