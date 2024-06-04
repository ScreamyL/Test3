package step;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputTemp extends Convert{

    protected static void InputTemp() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = 0.0;
        if(scanner.hasNextDouble()) {
            celsius = scanner.nextDouble();
        } else {
            throw new RuntimeException("не число");
        }

        System.out.println("Конвертировать в:");
        System.out.println("1.Кельвины");
        System.out.println("2.Фаренгейты");

        int choice;
        String choice2;

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();

            if (choice != 1 && choice != 2)
            {
                throw new RuntimeException("Введите 1 или 2, или словом");
            }

        }
            else
            {
                scanner.nextLine();
                choice2 = scanner.nextLine();

                String ch = choice2.substring(0, 1).toUpperCase() + choice2.substring(1);
                if (ch.equalsIgnoreCase("Кельвины"))
                {
                    choice = 1;
                }
                else if (ch.equalsIgnoreCase("Фаренгейты"))
                {
                    choice = 2;
                }
                   else
                {
                    System.out.println(choice2);
                    throw new RuntimeException("Введите слово корректно");
                }

            }

            new Convert().convert(celsius, choice);
            scanner.close();





    }






}
