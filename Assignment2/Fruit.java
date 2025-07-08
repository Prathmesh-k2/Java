

public class Fruit {
    private String color;
    private double weight;
    private String name;
    private boolean isFresh;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFresh(boolean fresh) {
        this.isFresh = fresh;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public boolean getFresh() {
        return isFresh;
    }

    public String taste() {
        return "No specific taste";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Weight: " + weight + ", Color: " + color + ", Fresh: " + isFresh;
    }
}
