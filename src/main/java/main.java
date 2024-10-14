import java.util.Scanner;

public class main {
    public static void main(String[] args) {



        Scanner scanner =new Scanner(System.in);
        Triangle triangle =new Triangle();
        System.out.print("Введите длину первой стороны: ");
        triangle.a= scanner.nextDouble();
        System.out.print("Введите длину второй стороны: ");
        triangle.b= scanner.nextDouble();
        System.out.print("Введите длину третьей стороны: ");
        triangle.c= scanner.nextDouble();
        triangle.area(); 
    }
}
