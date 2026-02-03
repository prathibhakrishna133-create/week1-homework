class Temperature {

    private double celsius;

    void setCelsius(double value) {
        if (value >= -273.15) {
            this.celsius = value;
        } else {
            System.out.println("Invalid temperature! Below absolute zero.");
        }
    }

    double getCelsius() {
        return celsius;
    }
}
class code19
{

    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.setCelsius(25);
        System.out.println("Temperature: " + t.getCelsius());
    }
}