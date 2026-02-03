class Employee
 {
     private double salary;
     void setSalary(double salary) 
     {
        if (salary >= 0) 
         {
            this.salary = salary;
         } 
         else
          {
            System.out.println("Invalid salary! Salary cannot be negative.");
          }
     }
    double getSalary()
     {
        return salary;
     }
 }

    class code13
    {
    public static void main(String[] args) 
     {
        Employee emp = new Employee();
        emp.setSalary(30000);  
        System.out.println("Employee Salary: " + emp.getSalary());
     }
    }