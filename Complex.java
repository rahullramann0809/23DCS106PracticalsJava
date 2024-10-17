import java.util.Scanner;
public class Complex {

    int r1,i1,r2,i2;
      Complex(int r1, int i1, int r2, int i2)
      {
        this.r1 =r1;
        this.i1= i1;
        this.r2= r2;
        this.i2= i2;
        
      }

   int addComplex()
   {
    System.out.println("Addition of Complex Numbers:"+(this.r1+this.r2)+"+"+(this.i1+this.i2)+"i");
    return 0;
   }

   int mulComplex()
   {
    System.out.println("Multiplication of Complex Numbers:"+(this.r1*this.r2)+"+"+(this.i1*this.i2)+"i");
    return 0;
   }

   int subComplex()
   {
    System.out.println("Subtraction of the Complex Numbers: "+(this.r1-this.r2)+"+"+(this.i1-this.i2)+"i");
    return 0;
   }
    

   public static void main(String[] args)
   {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the r1: ");
    int r1 = sc.nextInt();
    System.out.println("Enter the i1: ");
    int i1 = sc.nextInt();
    System.out.println("Enter the r2: ");
    int r2 = sc.nextInt();
    System.out.println("Enter the i2: ");
    int i2 = sc.nextInt();
    sc.close();


     Complex A =new Complex(r1, i1, r2, i2);
     A.addComplex();
     A.mulComplex();
     A.subComplex();
   }

}
