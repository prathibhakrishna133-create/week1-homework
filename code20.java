class Voter {

    private int age;

    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be positive.");
        }
    }

    boolean isEligible() {
        return age >= 18;
    }
}
class code20
{

    public static void main(String[] args) {
        Voter v = new Voter();
        v.setAge(20);

        if (v.isEligible()) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}