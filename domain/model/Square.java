package domain.model;

public class Square extends Shape {
    private int width;

    public Square(int x, int y, int width) {
        super(x, y);
        setWidth(width);
    }

    public Square(int width) {
        this(0, 0, width);
    }

    @Override
    public int getArea() {
        return getWidth() * getHeight();
    }

    @Override
    public int getPerimeter() {
        return 2 * getWidth() + 2 * getHeight();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) throws IllegalArgumentException {
        if (width < 0)
            throw new IllegalArgumentException("Side cannot be negative");
        this.width = width;
    }

    public int getHeight() {
        return getWidth();
    }

    public void setHeight(int width) {
        setWidth(width);
    }
}
