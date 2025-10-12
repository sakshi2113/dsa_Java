package Basic;

import java.util.ArrayList;
import java.util.Collections;

public class PrintAllDivisor {
    public static void divisor(int n) {
        ArrayList <Integer> divisors =new ArrayList<>();
        for (int i = 1; i <=(int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (n / i != i) {
                   divisors.add(n/1);
                }
            }
        }
        Collections.sort(divisors);

        //print sorted lst
        for (int d : divisors) {
            System.out.print(d + " ");
        }
    }

    public static void main(String[] args) {
        int n=36;
        divisor(n);
    }
}
