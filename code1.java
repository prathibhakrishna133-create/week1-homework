class Student
{
    String name;
    int age;
    int marks;
    Student(String name,int age,int marks)
    {
     this.name = name;
     this.age = age;
     this.marks = marks;
    }
    void print()
    {
        System.out.println("NAME : " +name);
        System.out.println("AGE : " +age);
        System.out.println("MARKS : " +marks);
    }
}
class code1
{
    public static void main(String[]args)
    {
       Student S1 = new Student("Alice",20,89);
       Student S2 = new Student("Bob",20,98);
       S1.print();
       S2.print();

    }

}