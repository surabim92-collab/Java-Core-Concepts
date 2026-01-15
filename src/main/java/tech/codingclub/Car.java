package tech.codingclub;

public class Car implements CarInterface {
    public static final int maxSpeed = 300;    //to access the class an object of that class  is firstly needed but static makes it
    public static int wheelCount = 4;                         //possible without object

    private int currentSpeed = 0; // any method will be able to access but
    String numberPlate;

    //default constructer
    public Car() {

    }

    public Car(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public Car(String numberPlate, int currentSpeed) {
        this.numberPlate = numberPlate;
        this.currentSpeed = currentSpeed;
    }

    public void accelerate() {
        System.out.println("Speed up !" + numberPlate);
        currentSpeed += 10;
    }

    //Static method can only access or modify static data variables only
    public static void printAboutWheel() {
        // not valid to write this currentSpeed+=10
        // but valid is
        System.out.println("Car wheelcount is " + wheelCount);
    }

    public void applyBrake() {
        currentSpeed = 0;
    }

    public static void main(String[] args) {

        Car audi = new Car("Audi 007");
        System.out.println("Current Speed Audi : " + audi.currentSpeed);
        audi.accelerate();
        audi.wheelCount = 8;
        System.out.println("Current Speed Audi :" + audi.currentSpeed);

        Car bmw = new Car("bmw 707", 100);
        bmw.accelerate();
        bmw.currentSpeed += 100;
        System.out.println("Current Speed bmw:" + bmw.currentSpeed);
        System.out.println("audi wheelcount is :" + audi.wheelCount);
        System.out.println(" bmw wheelcount is :" + bmw.wheelCount);
        System.out.println("Car has " + Car.wheelCount + " wheels");// Car.wheelCount because its static
        //audi.printAboutWheel(); or bmw.printAboutWheel();
        Car.printAboutWheel();
        Car.wheelCount = 4;
        System.out.println("now bmw wheelcount " + bmw.wheelCount);
        System.out.println("now audi wheelcount " + audi.wheelCount);
        Car.printAboutWheel();


    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void increasedSpeed(int i) {
        if (i < 0) return;
        currentSpeed += i;
        if (currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed;
        }

    }


}


    

