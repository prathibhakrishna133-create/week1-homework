class College
 {
    String collegeName;
    String location;

    void displayDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location    : " + location);
        System.out.println("-------------------------");
    }
 }
class code10
{
    public static void main(String[] args) {

        College c1 = new College();
        College c2 = new College();
        College c3 = new College();
        
        c1.collegeName = "ABC Engineering College";
        c1.location = "Bengaluru";

        c2.collegeName = "XYZ Degree College";
        c2.location = "Hyderabad";

        c3.collegeName = "PQR Institute of Technology";
        c3.location = "Chennai";

      
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}