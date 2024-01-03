import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int min = num1<num2?num1:num2;
        System.out.println(min);
        int gcd = 0;
        for(int i=1;i<=min;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                 gcd = i;
            }
        }
        System.out.println("GCD of "+num1+" and "+num2+" is "+gcd);
    }
}

