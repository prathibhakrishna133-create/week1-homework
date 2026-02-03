class Product {

    private double price;
    private int stock;

    void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Price must be positive.");
        }
    }

    void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Invalid stock! Stock cannot be negative.");
        }
    }

    void display() {
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}
class code17
{

    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(500);
        p.setStock(10);
        p.display();
    }
}