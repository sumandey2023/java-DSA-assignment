import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int t1 =0,t2=1,nextTerm = t1+t2;
        System.out.print("Fibonacci Series is:- ");
        System.out.print(t1+" "+t2+" ");
        for(int i=3;i<=n;i++)
        {
            System.out.print(nextTerm+" ");
            t1 = t2;
            t2 = nextTerm;
            nextTerm = t1+t2;
        }
    }
}
