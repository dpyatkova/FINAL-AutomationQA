package JavaCFS1;

public class JavaCFS1 {

    private static String data = "Рассерженный Родион Романович раскричался: «Рано радовались, размокший ремень рюкзака разорвался";

    public static void main(String[] args) {
        data = data.replaceAll("[рР]", "*");
        System.out.println("Replaced: " + data);
    }
}
