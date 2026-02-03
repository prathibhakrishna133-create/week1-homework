class Book {

    private String title;
    private boolean isAvailable = true;

    Book(String title) {
        this.title = title;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    void returnBook() {
        isAvailable = true;
        System.out.println(title + " returned successfully.");
    }
}
class code18
{
    public static void main(String[] args) {
        Book b = new Book("Java Programming");
        b.borrowBook();
        b.borrowBook(); // already borrowed
        b.returnBook();
    }
}