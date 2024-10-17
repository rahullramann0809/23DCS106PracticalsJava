 class Degree {

    void getDegree()
    {
        System.out.println("I got a Degree");
    }

    public static void main(String[] args)
    {
        Degree D = new Degree();
        Postgraduate P = new Postgraduate();
        Undergraduate U = new Undergraduate();

        D.getDegree();
        P.getDegree();
        U.getDegree();
    }
    
}

class Undergraduate extends Degree{
     
    void getDegree()
    {
        System.out.println("I am Undergraduate");
    }
}

class Postgraduate extends Degree{
     
    void getDegree()
    {
        System.out.println("I am Postgraduate");
    }
}
