public class Vehicle {
    private String PassingNo;

    public Vehicle(String passingNo) {
        this.PassingNo = passingNo;
    }


    public String getPassingNo() {
        return PassingNo;
    }

    public void setPassingNo(String passingNo) {
        PassingNo = passingNo;
    }
    public void start(){
        System.out.println("Base Start");
    }
    public void stop(){
        System.out.println("Base Stop");
    }

    public void display(){

        System.out.println("passingNo = "+ getPassingNo());
    }

}
