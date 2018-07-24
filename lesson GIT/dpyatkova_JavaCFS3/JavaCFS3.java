package dpyatkova_JavaCFS3;

import java.util.Random;
import java.util.Scanner;

public class JavaCFS3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = 5 + random.nextInt(156 - 5);
        if ((num > 25) && (num < 100)) System.out.printf("Число " + num + " содержится в интервале (25,100)");
        else System.out.printf("Число " + num + " не содержится в интервале (25,100)");

    }
}
