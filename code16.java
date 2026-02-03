class Mobile {

    private int batteryLevel;

   
    Mobile(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            this.batteryLevel = 50;
        }
    }
    void charge(int amount) {
        if (amount > 0) {
            batteryLevel += amount;
            if (batteryLevel > 100) {
                batteryLevel = 100;
            }
            System.out.println("Charged by " + amount + "%");
        } else {
            System.out.println("Invalid charge amount");
        }
    }

    void use(int amount) {
        if (amount > 0 && amount <= batteryLevel) {
            batteryLevel -= amount;
            System.out.println("Battery used: " + amount + "%");
        } else {
            System.out.println("Insufficient battery or invalid usage");
        }
    }

    
    int getBatteryLevel() {
        return batteryLevel;
    }
}
class code16
{
    public static void main(String[] args)
     {
        Mobile mobile = new Mobile(60);
        System.out.println("Initial Battery: " + mobile.getBatteryLevel() + "%");
        mobile.charge(30);
        mobile.use(50);
        System.out.println("Final Battery: " + mobile.getBatteryLevel() + "%");
     }
}