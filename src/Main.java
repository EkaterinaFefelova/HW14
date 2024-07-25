import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        //String string = String.valueOf(num);
        String string = Integer.toString(num);
        double sum=0;
        for (int i=0; i<string.length(); i++) {
            sum += Integer.parseInt(String.valueOf(string.charAt(i)));
            System.out.println (sum);
        }
        return sum /string.length();
    }
}
