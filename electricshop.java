import java.util.Scanner;

public class electricshop {
    public static void main(String[] args)
    {    Scanner sc = new Scanner(System.in);
        int[] productcode = {1,2,3,4,5};
        double[] prices = {2000,2500,300,500,1000};
        double bill=0;
        
        int i;
        for(i=0;i<productcode.length;i++)
        {
           int code = productcode[i];
           double price = prices[i];
           sc.close();
           double taxrate=0;

           switch (code) 
        {   case 1:  taxrate = 0.08;
                     break;
            case 2: taxrate = 0.12;
                    break;
            case 3: taxrate = 0.05;
                    break;
            case 4: taxrate = 0.075;
                    break;
            case 5: taxrate = 0.03;
                    break;
           }

           double tax ;
           double totalprice;
           tax = price * taxrate;
           totalprice = price + tax;
           bill = totalprice + bill;
           }
           for(i=0;i<productcode.length;i++)
           {
            System.out.print("\nProduct code: "+productcode[i]);
            System.out.print("\nPrice :"+prices[i]);
           }
          
           System.out.print("Total bill: "+bill);
        }
    }
