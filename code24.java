
class Shape {
    String color;
}

class Circle extends Shape {
    void area(double r) {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area(double l, double b) {
        System.out.println("Rectangle Area: " + (l * b));
    }
}
class code24
{

    public static void main(String[] args) {
        Circle c = new Circle();
        c.color = "Red";
        c.area(7);

        Rectangle r = new Rectangle();
        r.color = "Blue";
        r.area(5, 4);
    }
}
