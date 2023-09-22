package domain.model;

public class Rect extends Square {
    private int height;

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
