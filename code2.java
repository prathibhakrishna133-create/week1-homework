class Rectangle
{
    int length;
    int width;

    void Area(int length , int width)
    {
       int area = length * width;
        System.out.println(" The area of the rectangle is  " +area);
    }
    void perimeter(int length , int width)
    {
       int p = 2 * (length + width);
        System.out.println(" The perimeter of the rectangle is  " +p);

    }
}
class code2
{
    public static void main(String[]args)
    {
        Rectangle r = new Rectangle();
        r.Area(20,30);
        r.perimeter(50,30);
    }
}