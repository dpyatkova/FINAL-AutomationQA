package Solution4;

public class Solution4 {
    public static void main(String[] args) {
        double n = 48d;
        double first = n / 10;
        double firstS = Math.floor(first);
        double second = n % 10;
        double sum = firstS + second;
        System.out.println(sum);
    }
}