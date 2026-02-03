class Car {
    private int speed;
    void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed! Speed must be between 0 and 200.");
        }
    }
    int getSpeed() {
        return speed;
    }
}
class code15
{
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(120);
        System.out.println("Car Speed: " + car.getSpeed());
    }
}