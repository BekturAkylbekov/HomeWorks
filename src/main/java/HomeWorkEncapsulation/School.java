package HomeWorkEncapsulation;

public class School {
    private String name;
    private int yearOfFoundation;

    @Override
    public String toString() {
        return
                "name= " + name +" "+
               "yearOfFoundation= " + yearOfFoundation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }
}
