public class MyClass {
String name,food;
String lastName;
int age;
String[] lessons;



    public MyClass(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.food= "lagman";
        this.lessons = new String[]{"Java","Spring","Hibernate"};
    }
    public MyClass(String name, String lastName, int age,String food,String[]lessons) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.food=food;
        this.lessons=lessons;
    }

    public void info(){
        System.out.println("Аты: "+name);
        System.out.println("FIO: "+lastName);
        System.out.println("Jashy: "+age);
        System.out.println("Jakshy korgon tamagy: "+food);
        System.out.print("сабактары: ");
        for (String beka:lessons){
            System.out.println(beka +" ");


        }
    }
}
