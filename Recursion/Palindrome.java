import java.util.Scanner;
public class Palindrome {
    static int reverseNum(int n){
        if (n==0)
            return 0;
        return (n%10)+10*reverseNum(n/10);
    }
    static boolean isPalindrome(int n) {
        return n == reverseNum(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (isPalindrome(n))
            System.out.println(n+" is Palindrome");
        else
            System.out.println(n+" isn't Palindrome");
        sc.close();
     }
}

