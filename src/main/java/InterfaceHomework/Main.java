package InterfaceHomework;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EducationCenter school = new School("Bokonbaev","Bazar-Korgon",LocalDate.of(1990,1,19));
         EducationCenter university = new University("Ala_too","Kyrgyzstan", LocalDate.of(2005,10,12));
         EducationCenter college = new College("Политех","Bishkek",LocalDate.of(1987,2,4));
         Student student1 = new Student("Bektur","Akylbekov","male",LocalDate.of(2022,9,1),university);
        Student student2 = new Student("Adilet","Anarbekov","male",LocalDate.of(2001,5,1),school);
        Student student3 = new Student("Maksat","Baishbekov","male",LocalDate.of(2004,2,1),college);
        Student student4 = new Student("Feruza","Jenishbek kyzy","famale",LocalDate.of(2018,9,1),university);

Student[] students ={student1,student2,student3,student4};


        student2.getStudentsEducationCenter(students);
student1.getStudentsStudyingYear(students);
    }

}
