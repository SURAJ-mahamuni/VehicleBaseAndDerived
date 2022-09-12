public class Car extends Vehicle{
    private int fuelType;

    public int getFuelType() {
        return fuelType;
    }

    public void setFuelType(int fuelType) {
        this.fuelType = fuelType;
    }
    public void start(){
        System.out.println("(Start)Derived car class");
    }
    public void stop(){
        System.out.println("(stop)Derived car class");
    }
    //1 = petrol
    //2 = diesel
    //3 = electric
    public Car(int fuelType, String ps ) {
        //super("mh26abgh1234");
        super(ps);
        this.fuelType = fuelType;
    }
    public void display(){
        super.display();
        System.out.println("FuelType = "+getFuelType());
    }
}
