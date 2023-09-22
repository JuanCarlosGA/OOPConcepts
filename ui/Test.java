package ui;
import domain.model.*;

public class Test {
    public static void main(String[] args) {
        var s1 = new Square();

        s1.setWidth(5);
        
        System.out.println(s1.getWidth());
        System.out.println(s1.getHeight());

        s1.setHeight(10);

        System.out.println(s1.getWidth());
        System.out.println(s1.getHeight());
    }
}
