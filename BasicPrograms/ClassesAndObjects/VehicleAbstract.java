abstract class VehicleDemo{
    abstract void start();
    void stop(){
        System.out.println("Vehicle stopped");
    }
}

class Car extends VehicleAbstract{
    @Override
    void start(){
        System.out.println("Car started");
    }
}
class Bike extends VehicleAbstract{
    @Override
    void start(){
        System.out.println("Bike started");
    }
}
class Bus extends VehicleAbstract{
    @Override
    void start(){
        System.out.println("Bus started");
    }
}
class VehicleAbstract{
    public static void main(String[] args){
        VehicleDemo v;
        v = new Car();
        v.start();
        v.stop();
        v = new Bike();
        v.start();
        v.stop();
        v = new Bus();
        v.start();
        v.stop();
    }
}