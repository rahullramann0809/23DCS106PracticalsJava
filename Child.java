class Parent {

   Parent()
   {
    System.out.println("Parent Class");
   }

}

class Child extends Parent
{
    Child()
    {  
        this(1);
        System.out.println("Child Class");
    }
    Child(int a)
    {
        super();
        System.out.println("1 Argument class");
    }
    public static void main(String[] main)
    {
        new Child();
    }
}