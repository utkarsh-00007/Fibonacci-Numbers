import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which you want fibonacci series: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i = 0; i<n-2; i++){
            int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
