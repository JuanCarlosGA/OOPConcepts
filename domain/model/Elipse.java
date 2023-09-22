package domain.model;

public class Elipse extends Circle {
    private int secondRadius;

    @Override
    public int getArea() {
        return (int) (Math.PI * getRadius() * getSeccondRadius());
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * Math.sqrt((Math.pow(getRadius(), 2) + Math.pow(getSeccondRadius(), 2)) / 2));
    }

    public int getSeccondRadius() {
        return secondRadius;
    }

    public void setSecondRadius(int secondRadius) throws IllegalArgumentException {
        if (secondRadius < 0)
            throw new IllegalArgumentException("Second radius cannot be negative");
        this.secondRadius = secondRadius;
    }
}
