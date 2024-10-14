public class Employee {
    String name;
    int age;
    int emgekAkysy;
    int opyty;
    public void jashy(){
        if (age<18){
            System.out.println(name+" --------иштого жашын жетпейт чогойгондо кел");
        }
        else {
            System.out.println(name+"-------- Жашын жетет");
        }

    }
    public void akchasy(){
        System.out.println(name+"-----------3айлык акысы "+emgekAkysy*3);
    }
    public void opyt(){
        if (opyty>5){
            System.out.println("Иш тажрыйбасы 5 жылдан ойдо ----------"+name);
        }
    }

public void get(){
    System.out.println("Аты: " +name);
    System.out.println("Жашы: "+age);
    System.out.println("Айлык акысы:" +emgekAkysy);
    System.out.println("Опыты: "+ opyty);
    System.out.println("______________________________");
}

}


