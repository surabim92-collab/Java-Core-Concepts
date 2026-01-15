package tech.codingclub;

public class LearnClass {
    public static void main(String[] args) {
        Car audi = new Car("Audi 007");
        audi.accelerate();
        audi.wheelCount = 8;
        System.out.println("Current Speed Audi :" + audi.getCurrentSpeed());

        Car bmw = new Car("bmw 707", 100);
        bmw.accelerate();
        bmw.increasedSpeed(1000);
        System.out.println("Current Speed bmw:" + bmw.getCurrentSpeed());
        System.out.println("audi wheelcount is :" + audi.wheelCount);
        System.out.println(" bmw wheelcount is :" + bmw.wheelCount);
        System.out.println("Car has " + Car.wheelCount + " wheels");// Car.wheelCount because its static
        //audi.printAboutWheel(); or bmw.printAboutWheel();
        Car.printAboutWheel();
        Car.wheelCount = 4;
        System.out.println("now bmw wheelcount " + bmw.wheelCount);
        System.out.println("now audi wheelcount " + audi.wheelCount);
        Car.printAboutWheel();

        DummyCar car1 = new DummyCar() {
            public void move() {
                // x,y;
                //this.accelerate
                //this.getCurrentSpeed();
            }
        };
    }

}
