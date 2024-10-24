package InheritanceHomeWork;

public class Dancer extends Person{

    String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void learn() {
        System.out.println("we are learning toreto dance");
    }

    @Override
    public void walk() {
        System.out.println("We are walking in the concert");
    }

    @Override
    public void eat() {
        System.out.println("We are eat sushi");
    }

    public void dancing(){
        System.out.println("We are dancing");
    }
}
