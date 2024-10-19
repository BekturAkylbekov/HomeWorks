package HomeWorkEncapsulation;

public class Person {
    private String name,lastName;
    private int age;

    @Override
    public String toString() {
        return
                "name= " + name +" "+
                "lastName= " + lastName +
                " age= " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
