package tech.codingclub;

public class ElectricCar extends Car {
    private double batteryLeft = 100;

    public ElectricCar() {
        super();
    }

    public ElectricCar(String numberPlate) {
        super(numberPlate);//super means call constructer of my parent class
    }

    public ElectricCar(String numberPlate, int currentSpeed) {
        super(numberPlate, currentSpeed);
    }

    public double batteryPercentageLeft() {
        return batteryLeft;
    }

    // what if we want to modiy how the accelerator works
    public void accelerate() {
        //polymorphism
        super.accelerate();
        batteryLeft = batteryLeft - 0.50;
    }

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla 001", 500);
        tesla.accelerate();
        ElectricCar.printAboutWheel();
        System.out.println("TESLA SPEED: " + tesla.getCurrentSpeed() + " , Battery :" + tesla.batteryPercentageLeft());
    }
}
