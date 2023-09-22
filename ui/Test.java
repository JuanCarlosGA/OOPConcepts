package ui;
import domain.model.Shape;

public class Test {
    public static void main(String[] args) {
        // make two var of Shape called shape1 and shape2 and give them different values
        Shape shape1 = new Shape(1, 2);
        Shape shape2 = new Shape(3, 4);

        // print the values of shape1 and shape2
        System.out.println("shape1: " + shape1.getX() + ", " + shape1.getY());
        System.out.println("shape2: " + shape2.getX() + ", " + shape2.getY());

        // use setX and setY to change the values of shape1 and shape2 and print them again
        shape1.setX(5);
        shape1.setY(6);
        shape2.setX(7);
        shape2.setY(8);

        System.out.println("shape1: " + shape1.getX() + ", " + shape1.getY());
        System.out.println("shape2: " + shape2.getX() + ", " + shape2.getY());
    }
}
