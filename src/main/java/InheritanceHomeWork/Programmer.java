package InheritanceHomeWork;

public class Programmer extends Person{
    String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public  void coding(){
        System.out.println("I'm coding");
    }
    @Override
    public void learn() {
        System.out.println("I'm learning Java language");
    }

    @Override
    public void walk() {
        System.out.println("I am walking in the park Ata-Turk ");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating Ash");

    }
}


