package EnumHomework.Task2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Күндү жазыңыз (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday): ");

        String input = scanner.nextLine().toUpperCase();
        Days days = Days.valueOf(input);
        System.out.println(days.getA());
    }}
}