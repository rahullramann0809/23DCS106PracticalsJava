 class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("John", "Doe", 3000);
        Employee employee2 = new Employee("Jane", "Smith", 3500);

        
        System.out.println("Employee 1 Yearly Salary: " + employee1.getyearsalary());
        System.out.println("Employee 2 Yearly Salary: " + employee2.getyearsalary());

        
        employee1.giveRise();
        employee2.giveRise();

        
        System.out.println("Employee 1 Yearly Salary after 10% raise: " + employee1.getyearsalary());
        System.out.println("Employee 2 Yearly Salary after 10% raise: " + employee2.getyearsalary());
    }
}

class Employee
{
 String firstname;
 String lastname;
 Double salary;

 Employee(String firstname, String lastname, double salary)
 {
    this.firstname = firstname;
    this.lastname = lastname;
    this.salary = salary;
 }

 public String getfirstname()
 {
    return firstname;
 }

 public void setfirstname(String firstname)
 {
    this.firstname = firstname;
 }

 public String getlastname()
 {
    return lastname;
 }

 public void setlastname(String lastname)
 {
    this.lastname = lastname;
 }
 public double getsalary()
 {
    return salary;
 }

 public void setsalary(double salary) {
    if (salary > 0) {
        this.salary = salary;
    } else {
        this.salary = 0.0;
    }
}
public double getyearsalary()
{
    return 12*salary;
}

public void giveRise()
{
    salary*=1.10;
}
}