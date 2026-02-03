
class Mobile
 {

    String brand;
    int batteryPercentage;

    void charge(int percent) {
        if (percent > 0) {
            batteryPercentage += percent;
            if (batteryPercentage > 100) {
                batteryPercentage = 100;
            }
            System.out.println("Mobile charged by " + percent + "%");
        } else {
            System.out.println("Invalid charge percentage");
        }
    }

    void useBattery(int percent) {
        if (percent > 0 && percent <= batteryPercentage) {
            batteryPercentage -= percent;
            System.out.println("Battery used: " + percent + "%");
        } else {
            System.out.println("Insufficient battery or invalid usage");
        }
    }

    void displayStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Battery Percentage: " + batteryPercentage + "%");
    }

}
class code9
{
    public static void main(String[] args) {

    
        Mobile m = new Mobile();
        m.brand = "Samsung";
        m.batteryPercentage = 50;

        m.displayStatus();
        m.charge(30);
        m.useBattery(20);
        m.displayStatus();
    }
}
