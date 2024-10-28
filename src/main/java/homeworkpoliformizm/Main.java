package homeworkpoliformizm;

public class Main {
    public static void main(String[] args) {
        Animal[] animals={new Eagle(),new Shark(),new Turtle()};


            Shark[] sharks = new Shark[animals.length];
            Turtle[] turtles = new Turtle[animals.length];
            Eagle[] eagles = new Eagle[animals.length];

            int sharkIndex = 0, turtleIndex = 0, eagleIndex = 0;
            for (Animal animal : animals) {
                if (animal instanceof Shark) {
                    ((Shark) animal).attack(); // Shark классынын методун чакыруу
                    sharks[sharkIndex++] = (Shark) animal; // Shark массивине кошуу
                } else if (animal instanceof Turtle) {
                    ((Turtle) animal).swim(); // Turtle классынын методун чакыруу
                    turtles[turtleIndex++] = (Turtle) animal; // Turtle массивине кошуу
                } else if (animal instanceof Eagle) {
                    ((Eagle) animal).fly(); // Eagle классынын методун чакыруу
                    eagles[eagleIndex++] = (Eagle) animal; // Eagle массивине кошуу
                }
            }
            System.out.println("Sharks array:");
            for (Shark shark : sharks) {
               shark.attack();
            }

            System.out.println("Turtles array:");
            for (Turtle turtle : turtles) {
              turtle.swim();
            }

            System.out.println("Eagles array:");
            for (Eagle eagle : eagles) {
              eagle.fly();
            }
        }
    }


