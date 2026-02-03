class Car
{
    String brand;
    String model;
    double price;
    Car(String b, String m, double p)
    {
        brand = b;
        model = m;
        price = p;
    }
    void display_details()
    {
        System.out.println("BRAND : " +brand);
        System.out.println("MODEL : " +model);
        System.out.println("PRICE : " +price);
        System.out.println("***************");
    }
}
class code3
{
    public static void main(String[]args)
    {
       Car c1 = new Car("Toyota","Fortuner",3500000);
       Car c2 = new Car("Hyundai","Venue",800000);
       c1.display_details();
       c2.display_details();

    }

}