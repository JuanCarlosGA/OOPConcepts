package domain.model;

public class Elipse extends Circle {
    private int secondRadius;

    public Elipse(int x, int y, int radius, int secondRadius) {
        super(x, y, radius);
        setSecondRadius(secondRadius);
    }

    public Elipse(int radius, int secondRadius) {
        this(0, 0, radius, secondRadius);
    }

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
