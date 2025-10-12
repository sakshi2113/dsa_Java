package Basic;

public class IsPrime {
    public static void prime(int n) {
        if (n==1){
            System.out.println("not prime");
            return;

        }
        for(int i=2;i*i<=n;i++){
            if (n%i==0){
                System.out.println("not prime number");
                return;
            }
        }

        System.out.println("prime number ");

    }
    public static void main(String[] args) {
        int n=21;
        prime(n);

    }
}
