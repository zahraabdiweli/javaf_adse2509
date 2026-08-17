package sess07_inheritance_and_polymorphism;

import java.util.Scanner;

public class RectCuboidDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the rectangle's length in cm: ");
        int length = sc.nextInt();

        System.out.print("Please enter the rectangle's width in cm: ");
        int width = sc.nextInt();

        Rectangle rect1 = new Rectangle(width, length);
        System.out.println(rect1);

        Cuboid cbd1 = new Cuboid(8, 5, 2);
        System.out.println(cbd1);

        sc.close();
    }
}