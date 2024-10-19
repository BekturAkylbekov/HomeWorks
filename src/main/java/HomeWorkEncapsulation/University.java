package HomeWorkEncapsulation;

public class University {
    private String name;
    private int yearOfFoundation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    @Override
    public String toString() {
        return
                "name= " + name +" "+
                "yearOfFoundation= " + yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }
}
