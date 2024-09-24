package decorator_pattern;

public abstract class Beverage {

    public enum Size { TALL, GRANDE, VENTI };

    protected Size size = Size.TALL;
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
