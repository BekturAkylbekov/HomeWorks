package InheritanceHomeWork;

public class Singer extends Person{

    String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    @Override
    public void learn() {
        System.out.println("i'm learning new music");
    }

    @Override
    public void walk() {
        System.out.println("i'm walking in the Bishkek");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating Manty");
    }
    public void singing(){
        System.out.println("i'm singing");
    }
    public void playGuitar(){
        System.out.println("i'm playing in the guitar");
    }


}
