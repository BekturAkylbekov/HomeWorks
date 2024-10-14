import java.util.Scanner;

public class main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
       Employee employee1= new Employee();
       employee1.name ="Bektur";
       employee1.age =20;
       employee1.opyty=6;
       employee1.emgekAkysy=20000;
       employee1.get();

        Employee employee2= new Employee();
        employee2.name ="Максат";
        employee2.age =17;
        employee2.opyty=3;
        employee2.emgekAkysy=13000;
        employee2.get();

        Employee employee3= new Employee();
        employee3.name ="Aziret";
        employee3.age =23;
        employee3.opyty=8;
        employee3.emgekAkysy=45000;
        employee3.get();

        Employee employee4= new Employee();
        employee4.name ="Marsel";
        employee4.age =10;
        employee4.opyty=2;
        employee4.emgekAkysy=14000;
        employee4.get();


        Employee employee5= new Employee();
        employee5.name ="Beka";
        employee5.age =56;
        employee5.opyty=8;
        employee5.emgekAkysy=20000;
        employee5.get();

        Employee employee6= new Employee();
        employee6.name ="Ernist";
        employee6.age =23;
        employee6.opyty=2;
        employee6.emgekAkysy=45000;
        employee6.get();


        Employee employee7= new Employee();
        employee7.name ="Adilet";
        employee7.age =20;
        employee7.opyty=6;
        employee7.emgekAkysy=20000;
        employee7.get();


        Employee employee8= new Employee();
        employee8.name ="Omurbek";
        employee8.age =32;
        employee8.opyty=7;
        employee8.emgekAkysy=12000;
        employee8.get();

        Employee employee9= new Employee();
        employee7.name ="Umar";
        employee7.age =26;
        employee7.opyty=2;
        employee7.emgekAkysy=3000;
        employee7.get();

        Employee employee10= new Employee();
        employee7.name ="Argen";
        employee7.age =29;
        employee7.opyty=10;
        employee7.emgekAkysy=32000;
        employee7.get();

        System.out.println("Метод танданыз:  1.жашы  2.айлык акысы 3.Иш тажрыйбасы:  ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                employee1.jashy();
                employee2.jashy();
                employee3.jashy();
                employee4.jashy();
                employee5.jashy();
                employee6.jashy();
                employee7.jashy();
                break;
            case 2:
                employee1.akchasy();
                employee2.akchasy();
                employee3.akchasy();
                employee4.akchasy();
                employee5.akchasy();
                employee6.akchasy();
                employee7.akchasy();
                break;
            case 3:
                employee1.opyt();
                employee2.opyt();
                employee3.opyt();
                employee4.opyt();
                employee5.opyt();
                employee6.opyt();
                employee7.opyt();
                break;
        }
    }
}
