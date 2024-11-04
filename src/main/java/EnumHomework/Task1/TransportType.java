package EnumHomework.Task1;

public enum TransportType {
    CAR(0.1), BUS(0.05), TRUCK(0.02);
private  double a;
    TransportType(double a) {
        this.a=a;
    }

    public double getA() {
        return a;
    }

    public  double calculateTravelCost(double distance){
        return distance*a;
    }

}
