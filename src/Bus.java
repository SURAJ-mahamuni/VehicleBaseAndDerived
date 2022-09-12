public class Bus extends Vehicle{
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void start(){
        System.out.println("(start) Derived bus class");
    }
    public void stop(){
        System.out.println("(stop) Derived bus class");
    }

    public Bus(int capacity, String ps) {
        super(ps);
        this.capacity = capacity;
    }
    public void display(){
        super.display();
        System.out.println("Capacity = "+getCapacity());
    }
}
