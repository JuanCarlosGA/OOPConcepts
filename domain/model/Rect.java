package domain.model;

public class Rect extends Square {
    private int height;

    public Rect(int x, int y, int width, int height) {
        super(x, y, width);
        setHeight(height);
    }

    public Rect(int width, int height) {
        this(0, 0, width, height);
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) throws IllegalArgumentException {
        if (height < 0)
            throw new IllegalArgumentException("Height cannot be negative");
        this.height = height;
    }
}
