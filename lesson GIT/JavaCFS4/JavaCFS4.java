package JavaCFS4;

import java.util.Arrays;
import java.util.*;

public class JavaCFS4 {

    private static String data = "Я у мамы программист";
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        System.out.println("Source: " + data);

        char[] result = data.toCharArray();
        LinkedHashSet<Character> temp = new LinkedHashSet<Character>();
        for (int i = 0; i < data.length(); i++) {
            if (temp.add(data.charAt(i))) {
                sb.append(data.charAt(i));

            }
        }
        System.out.println(data.toString());

    }

}
// запуталась в итоге:(((

