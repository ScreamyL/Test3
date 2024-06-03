import java.util.Scanner;

public class BaseConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        System.out.println("Конвертировать в:");
        System.out.println("1.Кельвины");
        System.out.println("2.Фаренгейты");
        int choice = scanner.nextInt();

        BaseConverter converter = new BaseConverter();
        converter.convert(celsius, choice);

        scanner.close();
    }

    public void convert(double celsius, int choice) {
        switch (choice) {
            case 1:
                double kelvin = celsius + 273.15;
                System.out.println(celsius + " градусов Цельсия = " + kelvin + " Кельвин");
                break;
            case 2:
                double fahrenheit = celsius * 9 / 5 + 32;
                System.out.println(celsius + " градусов Цельсия = " + fahrenheit + " Фаренгейт");
                break;
            default:
                System.out.println("Некорректный выбор");
        }
    }
}
