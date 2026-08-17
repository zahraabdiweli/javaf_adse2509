package sess07_inheritance_and_polymorphism;

public class Cuboid extends Rectangle {

    protected int breadth;

    public Cuboid() {
        super();
        this.name = "Cuboid";
        this.breadth = 0;
    }

    public Cuboid(int width, int length, int breadth) {
        super(width, length);
        this.name = "Cuboid";
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public long calcSurfaceArea() {
        return 2L * (
                calculateArea()
                + (long) width * breadth
                + (long) length * breadth
        );
    }

    public long calculateVolume() {
        return calculateArea() * breadth;
    }

    @Override
    public String toString() {
        return String.format(
                "%s Details%n" +
                "-------------------------------------------------------------%n" +
                "Width: %d%n" +
                "Length: %d%n" +
                "Breadth: %d%n" +
                "Surface Area: %d%n" +
                "Volume: %d%n" +
                "-------------------------------------------------------------%n",
                name, width, length, breadth,
                calcSurfaceArea(), calculateVolume()
        );
    }
}