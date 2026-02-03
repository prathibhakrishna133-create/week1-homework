class Person {
    String name;
    int age;
}

class Student extends Person {
    int rollNumber;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}
class code21
{

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Varsha";
        s.age = 20;
        s.rollNumber = 101;
        s.marks = 85;
        s.display();
    }
}