class Employee {
    String name;
    double basicSalary;

     void calculateGrossSalary()
      {
        double hra = 0.20 * basicSalary;  // 20% HRA
        double da = 0.10 * basicSalary;   // 10% DA
        double grossSalary = basicSalary + hra + da;

        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }

}
   class code5{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Varsha S";
        emp.basicSalary = 20000;
        emp.calculateGrossSalary();
    }
}