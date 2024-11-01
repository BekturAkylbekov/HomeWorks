package InterfaceHomework;

import java.time.LocalDate;

public class Student implements Study{
    String name,surname,gender;
    LocalDate dateOfStart;
    EducationCenter educationCenter;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", educationCenter=" + educationCenter +
                '}';
    }


    @Override
    public void getStudentsEducationCenter(Student[] students) {
        for (Student student:students) {
            System.out.println("Аты "+student.name+" "+student.getEducationCenter());
        }
    }


    @Override
    public void  getStudentsStudyingYear(Student[] students) {
        for (Student student:students) {
            System.out.println("Student "+student.name+" "+ student.dateOfStart+" ушул жылы окуп баштаган");

        }

    }
}
