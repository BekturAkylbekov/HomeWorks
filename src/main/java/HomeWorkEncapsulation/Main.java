package HomeWorkEncapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university1 = new University();
        university1.setName("Ala-too");
        university1.setYearOfFoundation(1990);

        University university2 = new University();
        university2.setName("Manas");
        university2.setYearOfFoundation(2000);

        University university3 = new University();
        university3.setName("AUCA");
        university3.setYearOfFoundation(2004);

        University[] beka = {university1, university2, university3};
        System.out.println("University");
        for (University universities : beka) {

            System.out.println(universities);
        }

        School school1 = new School();
        school1.setName("Семетей");
        school1.setYearOfFoundation(1990);
        School school2 = new School();
        school2.setName("Bokonbaev");
        school2.setYearOfFoundation(1008);

        School school3 = new School();
        school3.setName("Alykulov");
        school3.setYearOfFoundation(2023);

        School[] schools = {school1, school2, school3};

        System.out.println("Schools");
        for (School ter : schools) {
            System.out.println(ter);
        }

        Person person1 = new Person();
        person1.setName("Bektur");
        person1.setLastName("Akylbekov");
        person1.setAge(30);

        Person person2 = new Person();
        person2.setName("Umar");
        person2.setLastName("Abdulaev");
        person2.setAge(20);

        Person person3 = new Person();
        person3.setName("Azamat");
        person3.setLastName("Japarov");
        person3.setAge(19);

        Person[] people={person1,person2,person3};
        System.out.println("People");
        for (Person person:people){
            System.out.println(person);
        }

        Car car1 =new Car();
        car1.setName("Toyota");
        car1.setModel("Camry");
        car1.setColor("White");

        Car car2 =new Car();
        car2.setName("Toyota");
        car2.setModel("Corola");
        car2.setColor("Black");

        Car car3 =new Car();
        car3.setName("Toyota");
        car3.setModel("Avensis");
        car3.setColor("Yellow");

        System.out.println("Cars");
         Car[] cars ={car1,car2,car3};

         for (Car car:cars){
             System.out.println(car);
         }

    }
}


