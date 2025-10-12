package Basic;

public class ArmStrong {
    public static boolean armStrong(int n) {
        int digit;
        int product = 0;
        int temp = n;
        int len = length(n);

        while (n != 0) {
            digit = n % 10;
            product = product + (int) Math.pow(digit, len);
            n = n / 10;
        }
        System.out.println(product);
        return product == temp;
    }

    public static int length(int n) {
        return String.valueOf(Math.abs(n)).length();
    }


    public static void main(String[] args) {
        int n = 371;
        System.out.println(armStrong(n));
        System.out.println(length(n));
    }
}
