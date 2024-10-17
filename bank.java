import java.util.Scanner;
class bank
{
    public static void main(String[] args)
    { int a;
        System.out.print("Enter 1 to check your balance: ");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        sc.close();
        if(a==1)
        {
            int balance = 20;
            System.out.print("your account has $"+balance); 
        }
        else
        {
            System.out.print("Thank you for visiting.");
        }
        
    }
}