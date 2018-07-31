package Randomnum;

import java.util.Random;
import java.util.Scanner;

public class Randomnum {

    public static void main(String[] args) {

        Random random = new Random(); // программа генерит случайное число
        int num = 0 + random.nextInt(9); // от 0 до 9

        System.out.println("Угадайте число от 0 до 9");
        Scanner scanner = new Scanner(System.in);

        int scan = scanner.nextInt(); // ждем ввода пользователя

        if (scan > num || scan < num) {

            for (int counter = 3; counter > 0; --counter) {
                if (scan > num) {
                    System.out.println("Ваше число больше загадонного. Повторите попытку.");
                    Scanner scanner2 = new Scanner(System.in);
                    int scan2 = scanner.nextInt();
                    scan = scan2;
                } else if (scan < num) {
                    System.out.println("Ваше меньше загадонного. Повторите попытку.");
                    Scanner scanner3 = new Scanner(System.in);
                    int scan3 = scanner.nextInt();
                    scan = scan3;

                }

            }
            if (scan == num) {
                System.out.println("Вы победили:)");
            }
        }
        if (scan > num || scan < num) {
            System.out.println("Вы проиграли:(");

        }
    }

}







