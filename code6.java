
class Circle 
{
    double radius;
    void calculateArea()
     {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
   class code6
   {
    public static void main(String[] args)
     {

      Circle c = new Circle();
      c.radius = 7;
      c.calculateArea();
    }
}
