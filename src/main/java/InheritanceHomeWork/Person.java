package InheritanceHomeWork;

public class Person {
    String name;
    String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void learn() {
        System.out.println("I'm learn English language");
    }

    public void walk() {
        System.out.println("I am walking in the park Yntymak ");
    }

    public void eat() {
        System.out.println("I'm eating lagman");
    }
}
