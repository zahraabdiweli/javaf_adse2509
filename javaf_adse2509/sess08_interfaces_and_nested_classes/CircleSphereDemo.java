package sess08_interfaces_and_nested_classes;

import java.util.Scanner;

public class CircleSphereDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the radius of circle c2 in cm: ");
        int rad1 = sc.nextInt();

        System.out.print("Please enter the radius of sphere sp2 in cm: ");
        int rad2 = sc.nextInt();

        Circle c1 = new Circle();
        c1.setRadius(7);

        Circle c2 = new Circle(rad1);

        Sphere sp1 = new Sphere();
        sp1.setRadius(7);

        Sphere sp2 = new Sphere(rad2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(sp1);
        System.out.println(sp2);

        sc.close();
    }
}