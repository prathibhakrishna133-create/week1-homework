class Book
 {
    String title;
    String author;
    double price;
    Book(String title , String author, double price)
    {
      this.title = title;
      this.author = author;
      this.price = price;

    }
    void displayDetails()
     {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println("-----------------------");
    }
}
    class code7
    {
    public static void main(String[] args)
     {
        Book b1 = new Book("Java Programming","James Gosling",450);
        Book b2 = new Book("Data Structures","Mark Allen Weiss",550);
        Book b3 = new Book("Operating Systems","Abraham Silberschatz",600);  
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}