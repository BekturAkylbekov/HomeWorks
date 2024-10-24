package InheritanceHomeWork;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bektur", "Beka");
        System.out.println("Name:" + person.name + " designation:" + person.designation);
        person.learn();
        person.walk();
        person.eat();
        System.out.println("____________________________________");

        Programmer programmer = new Programmer("Adil", "SoftwareEnginer", "Google");
        System.out.println("Name:" + programmer.name + " designation:" + programmer.designation + " companyName:" + programmer.getCompanyName());
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println("---------------------------------------");

        Dancer dancer = new Dancer("Aziret", "boys", "good boys");
        System.out.println("Name:" + dancer.name + " designation:" + dancer.designation + " groupName:" + dancer.groupName);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println("_____________________________________________");

        Singer singer = new Singer("Мирбек", "Classical music", "Jorolor");
        System.out.println("Name:" + singer.name + " designation:" + singer.designation + " bandName:" + singer.bandName);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGuitar();
    }


}
