interface AdvancedArithmetic
{
   int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic
{
   
    public int divisor_sum(int n) 
    { int i,count=0;
      for(i=1;i<=n;i++)
      {
        if(n%i==0)
        {
           count=count+i;
        }
      } 
      return count; 
    }

    public static void main(String[] args)
    {
        MyCalculator D = new MyCalculator();
        System.out.println("The sum of all divisors are: "+D.divisor_sum(8));
       
    }
}