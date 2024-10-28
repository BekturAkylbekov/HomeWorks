package HomeworkModificator.Task2;

public class Main {
    public static void main(String[] args) {
method();
    }
public static void method() {
    Country country1 = new Country("America", "2000000", "American", 349533);
    System.out.println("Name:" + country1.getName());
    System.out.println("Kalky:" + country1.getKalky());
    System.out.println("tili:" + country1.getTili());
    System.out.println("aianty:" + country1.getAianty());
    System.out.println("--------------------------------");

    Country country2 = new Country("Russis", "43600000", "Russian", 369535);
    System.out.println("Name:" + country2.getName());
    System.out.println("Kalky:" + country2.getKalky());
    System.out.println("tili:" + country2.getTili());
    System.out.println("aianty:" + country2.getAianty());
    System.out.println("--------------------------------");

    Country country3 = new Country("India", "8990000", "Indian", 4593343);
    System.out.println("Name:" + country3.getName());
    System.out.println("Kalky:" + country3.getKalky());
    System.out.println("tili:" + country3.getTili());
    System.out.println("aianty:" + country3.getAianty());
    System.out.println("--------------------------------");

    Country[] countries = {country1, country2, country3};

    Country min = Country.country(countries);
    System.out.println("Эң чоң аянттуу өлкө: " + min.getName() + " Аянты: " + min.getAianty());}
}
