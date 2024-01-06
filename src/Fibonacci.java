import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        //Ques-Find The nth Fibonaaci Number
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=input.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=number)
        {
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
