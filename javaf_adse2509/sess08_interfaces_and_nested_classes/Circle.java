package sess08_interfaces_and_nested_classes;

import sess07_inheritance_and_polymorphism.Shape;

public class Circle extends Shape implements I2DShape {

    protected int radius;

    public Circle() {
        this(0);
    }

    public Circle(int radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public float calcCircumference() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public float calcArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format(
                "%s Details%n" +
                "-------------------------------------------------------------%n" +
                "Radius: %d%n" +
                "Area: %.2f%n" +
                "Circumference: %.2f%n" +
                "-------------------------------------------------------------%n",
                getName(), radius, calcArea(), calcCircumference()
        );
    }
}