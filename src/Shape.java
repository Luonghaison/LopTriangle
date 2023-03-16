public class Shape {
    private String color = "green";
    private Boolean filled = true;

    public Shape() {
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled() {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape color of " +
                getColor() +
                " and " + (isFilled() ? " filled " : " not filled");
    }
}