package task4;

public class Person {
    String name;
    int age;
    String work;
    int salary;
    int price;
    Person[] massiv;

    public Person(String name, int age, String work, int salary, int price) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.price = price;
    }


    public void info(){
        System.out.println("name= " + name );
        System.out.println("age= " + age );
        System.out.println("work= "+work);
        System.out.println("salary= "+salary);
        System.out.println("price phone= "+ price);
        System.out.println("-----------------");

    }

    public int getSalary() {
        return salary;
    }
}
