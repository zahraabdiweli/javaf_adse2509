package sess07_inheritance_and_polymorphism;

/**
 * Represents a 2-dimensional rectangle.
 *
 * @author khaali
 */
public class Rectangle extends Shape {

    protected int width;
    protected int length;

    public Rectangle() {
        this.name = "Rectangle";
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(int width, int length) {
        this.name = "Rectangle";
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    protected long calculateArea() {
        return (long) width * length;
    }

    protected long calculatePerimeter() {
        return 2L * (width + length);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("""
                %s Details
                -------------------------------------------------------------
                Width: %d
                Length: %d
                Area: %d
                Perimeter: %d
                -------------------------------------------------------------
                """,
                getName(), width, length,
                calculateArea(), calculatePerimeter());
    }
}