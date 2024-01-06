import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=input.nextInt();
        System.out.println("Enter The Number to Find The Number Of Occuernce");
        int a=input.nextInt();
        int count=0;
        while (n>0)
        {
           int rem=n%10;
           if(rem==a)
           {
               count++;
           }
           n=n/10;
        }
        System.out.println("ans is "+count);
    }
}
