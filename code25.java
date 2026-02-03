
class Employee {
    String name;
    double salary;
}

class Developer extends Employee {
    void code() {
        System.out.println("Developer writes code");
    }
}

class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager manages team");
    }
}
class code25
{

    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Amit";
        d.salary = 50000;
        d.code();

        Manager m = new Manager();
        m.name = "Riya";
        m.salary = 80000;
        m.manageTeam();
    }
}
