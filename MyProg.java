import java.util.Scanner;
public class MyProg {

    public static void main(String [] args)
    {
        Game g = new Game();
        Cricket c = new Cricket();
        Badminton b = new Badminton();
        Tennis t = new Tennis();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of game: ");
        String op = s.nextLine();
        s.close();

        if(op.equals("cricket"))
         { g=c; }
         else if(op.equals("badminton"))
         {g=b;}
         else if(op.equals("tennis"))
         {g=t;}

         g.type();
    }
    
}
class Game
{
    public void type()
    {
        System.out.println("Indoor & outdoor");
    }
}

class Cricket extends Game
{
    public void type()
    {
        System.out.println("Outdoor game");
    }
}

class Badminton extends Game
{
    public void type()
    {
        System.out.println("indoor game");
    }
}

class Tennis extends Game
{
    public void type()
    {
        System.out.println("Mix Game");
    }
}