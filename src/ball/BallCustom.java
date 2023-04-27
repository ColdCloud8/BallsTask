package ball;

public class BallCustom {
    private String color;
    private double weight;

    public BallCustom(double weight, String color) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Add the weight of the ball" + weight);
        }
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("Add color! " + color);
        }
        this.weight = weight;
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return this.getColor() + " " + getWeight();
    }
}
