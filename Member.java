 class Member {
    String name,address;
    int age,salary;
    long number;

    public int printsalary(int salary)
    {
        return salary;
    }
    public String getname()
    {
        return name;
    }

    public void setname(String name)
    {
        this.name=name;
    }

    public int getage()
    {
       return age;
    }

    public void setage(int age)
    {
        this.age=age;
    }

    public long getnum()
    {
        return number;
    }

    public void setnum(long number)
    {
        this.number=number;
    }

    public String getadd()
    {
        return address;
    }

    public void setadd(String address)
    {
        this.address=address;
    }
    public void setsalary(int salary)
    {
      this.salary=salary;
    }

    public static void main(String[] args)
    {
        Employee A = new Employee();
        Manager B = new Manager();

        A.setspec("Software development");
        B.setdep("Debugging");
        
        A.setname("Rahul Raman");
        A.setage(20);
        A.setnum(7203994328L);
        A.setadd("Near Bus-stand at Ramol");
        A.setsalary(56000);

        B.setname("Maulya Sonii");
        B.setage(20);
        B.setnum(6351246380L);
        B.setadd("Vaniyavad Circle, Nadiad");
        B.setsalary(56000);
      
        System.out.println("Employee Name: " + A.getname());
        System.out.println("Employee Age: " + A.getage());
        System.out.println("Employee Number: " + A.getnum());
        System.out.println("Employee Address: " + A.getadd());
        System.out.println("Employee Specialization: " + A.getspec());
        System.out.println("Employee Salary: " + A.printsalary(A.salary));

        
        System.out.println("\nManager Name: " + B.getname());
        System.out.println("Manager Age: " + B.getage());
        System.out.println("Manager Number: " + B.getnum());
        System.out.println("Manager Address: " + B.getadd());
        System.out.println("Manager Department: " + B.getdep());
        System.out.println("Manager Salary: " + B.printsalary(B.salary));

    }


}

class Employee extends Member
{
  String specialization;

  public String getspec()
  {
    return specialization;
  }

  public void setspec(String specialization)
  {
    this.specialization=specialization;
  }
}

class Manager extends Member
{
  String department ;

  public String getdep()
  {
    return department;
  }

  public void setdep(String department)
  {
   this.department=department;
  }
}
