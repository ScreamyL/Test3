package step;

public class Convert {

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
