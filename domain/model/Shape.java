package domain.model;

public abstract class Shape{
    private int x = 0;
    private int y = 0;

    public Shape() {

    }
    
    public abstract int getArea();
    public abstract int getPerimeter();

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Make setters and getters for x and y, in the setters make that only positive and bellow 1000 values can be set
    public void setX(int x) {
        if (x >= 0 && x < 1000) {
            this.x = x;
        }
    }
    
    public void setY(int y) {
        if (y >= 0 && y < 1000) {
            this.y = y;
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}