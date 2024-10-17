 class Shape {

    void displayShape()
    {
        System.out.println("This is Shape");
    }
    
}

class Rectangle extends Shape{

    void displayRectangle()
    {
        System.out.println("This is Rectangluar Shape");
    }
}

class Circle extends Shape{

    void displayCircle()
    {
        System.out.println("This is Circular Shape");
    }
}

class Square extends Rectangle
{
   void displaySquare()
   {
    System.out.println("Square is Rectangle");
   }

   public static void main(String[] args)
   {
         Square A = new Square();
         A.displayShape();
         A.displayRectangle();
   }
}