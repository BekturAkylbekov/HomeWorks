package HomeWorkEncapsulation;

public class Car {
    private String name,model,color;

    @Override
    public String toString() {
        return
                "name='" + name + " "+
              "model='" + model + " " +
                "color='" + color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
