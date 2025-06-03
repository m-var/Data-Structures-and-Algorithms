import java.util.Scanner;

public class Armstrong {
    static int countDigit(int num) {
        if (num==0)
            return 0;
        return 1+countDigit(num/10);
    }
    static int sumOfDigits(int n, int p) {
        if (n==0)
            return 0;
        return (int)Math.pow((n%10), p)+ sumOfDigits((n/10), p);
    }
    static boolean isArmstrong(int n) {
        return n == sumOfDigits(n, countDigit(n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (isArmstrong(n))
            System.out.println(n+" is Armstrong");
        else
            System.out.println(n+" isn't Armstrong");
        sc.close();
    }
}
