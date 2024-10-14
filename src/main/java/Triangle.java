public class Triangle {
    double a,b,c;
    public void area(){
        double p = (a + b + c) / 2;

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника: " +area);
    }
}
