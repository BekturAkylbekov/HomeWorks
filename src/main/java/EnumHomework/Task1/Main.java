package EnumHomework.Task1;

public class Main {
    public static void main(String[] args) {

        for (TransportType transportType:TransportType.values()) {
            System.out.println(transportType+" 1 километрдин баасы: "+transportType.getA());
            System.out.println(transportType+" 30 киломометрдин баасы: "+transportType.calculateTravelCost(30));


        }}}
