import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int originalNumber = n;
        int rev = 0;
        while(n!=0){
            int rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if(originalNumber == rev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}