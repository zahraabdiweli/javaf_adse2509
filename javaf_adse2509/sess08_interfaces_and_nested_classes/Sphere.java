package sess08_interfaces_and_nested_classes;

public class Sphere extends Circle implements I3DShape {

    public Sphere() {
        super();
        this.name = "Sphere";
    }

    public Sphere(int radius) {
        super(radius);
        this.name = "Sphere";
    }

    @Override
    public float calcSurfaceArea() {
        return 4.0f * calcArea();
    }

    @Override
    public float calcVolume() {
        return (4.0f / 3.0f) * calcArea() * radius;
    }

    @Override
    public String toString() {
        return String.format(
                "%s Details%n" +
                "-------------------------------------------------------------%n" +
                "Radius: %d%n" +
                "Surface Area: %.2f%n" +
                "Volume: %.2f%n" +
                "-------------------------------------------------------------%n",
                getName(), radius, calcSurfaceArea(), calcVolume()
        );
    }
}