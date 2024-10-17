 class parent {
    void display()
    {
    System.out.println("Parent class");
    }  

    public static void main(String [] args)
    {
        child A = new child();
        parent B = new parent();
        A.display();
        B.display();
    }
}

 class child extends parent
 {
    void display()
    {
        System.out.println("Child class");
    }

 }
