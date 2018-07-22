package JavaCFS2;

public class JavaCFS2 {
    private static String data = "Рассерженный Родион Романович раскричался: «Рано радовались, размокший ремень рюкзака разорвался";
    private static StringBuffer replaced = new StringBuffer(data);

    public static void main(String[] args) {
        System.out.println("Source: " + data);

        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'р' || data.charAt(i) == 'Р') {
                replaced.setCharAt(i, '*');
            }
        }

        System.out.println("Replaced: " + replaced.toString());
    }
}
