package task4;

public class Main {
    public static void main(String[] args) {


    Person person1 = new Person("Bektur",20,"Programmer",6000,20000);
//       person1.info();
        Person person2 = new Person("Umar",16,"germansk",5000,30000);
//        person2.info();
      Person person3 = new Person("Azamat",19,"Ximik",4000,50000);
//        person3.info();
        Person person4 = new Person("Omat",21,"teacher",4000,12000);
//        person4.info();
        Person person5 = new Person("Abu",20,"taxi",3000,23244);
//        person5.info();

        Person[] massiv={person1,person2,person3,person4,person5};
        for(Person pep:massiv) {
            pep.info();
        }


        Person max=massiv[0];
        for (Person person:massiv) {
            if (person.getSalary()>max.getSalary()){
                max=person;

            }
        }
        System.out.println("самая большая зарплата ");
        max.info();



        Person min=massiv[0];

        for (Person person:massiv){
            if (person.getSalary()<min.getSalary()){

            min=person;
        }}
        System.out.println("Минималтная зарплата");
        min.info();
        }
}


