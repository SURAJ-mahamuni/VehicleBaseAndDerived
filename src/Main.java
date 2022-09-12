public class Main {
    public static void main(String [] args){

        Vehicle v1 = new Car(1,"MH 16 AT 4052");  // 1 = petrol 2 = diesel 3 = electric
        v1.display();

        System.out.println();

        Vehicle v2 = new Bus(49, "MH 12 HT 3423" );    //how many seat in bus
        v2.display();
        System.out.println("-------------------------------");





        CheckPost cp = new CheckPost();
        cp.checkVehicle(v1);  //Car object reference passing
        System.out.println("-------------------------------");
        cp.checkVehicle(v2);  //Bus object reference passing
    }
}
