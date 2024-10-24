package HomeworkModificator.Task2;

public class Country {
    private String name,kalky,tili;
    private int aianty;



    public Country(String name, String kalky, String tili, int aianty) {
        this.name = name;
        this.kalky = kalky;
        this.tili = tili;
        this.aianty = aianty;
    }
    public String getName() {
        return name;
    }

    public String getKalky() {
        return kalky;
    }

    public String getTili() {
        return tili;
    }

    public int getAianty() {
        return aianty;
    }

    public static Country countries(Country[] countries){
       Country max=countries[0];
        for (Country country:countries) {
        if(country.aianty> max.getAianty()){
            max=country;
        }
        }
return max;
    }

}
