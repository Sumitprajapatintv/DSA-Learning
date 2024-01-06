import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=input.nextInt();
        int ans=0;
        while(n>0)
        {
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        System.out.println("Answer is "+ans);
    }
}
