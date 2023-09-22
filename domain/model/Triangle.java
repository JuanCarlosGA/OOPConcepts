package domain.model;

public class Triangle extends Shape {
    private int sideSize = 0;
    private int sideSize2 = 0;
    private int sideSize3 = 0;

    @Override
    public int getArea() {
        return (int) (Math.sqrt((getPerimeter() / 2) * ((getPerimeter() / 2) - sideSize) * ((getPerimeter() / 2) - sideSize2) * ((getPerimeter() / 2) - sideSize3)));
    }

    @Override
    public int getPerimeter() {
        return sideSize + sideSize2 + sideSize3;
    }

    public void setSideSize(int sideSize) {
        if (sideSize >= 0) {
            this.sideSize = sideSize;
        }
    }

    public void setSideSize2(int sideSize2) {
        if (sideSize2 >= 0) {
            this.sideSize2 = sideSize2;
        }
    }

    public void setSideSize3(int sideSize3) {
        if (sideSize3 >= 0) {
            this.sideSize3 = sideSize3;
        }
    }

    public int getSideSize() {
        return this.sideSize;
    }

    public int getSideSize2() {
        return this.sideSize2;
    }

    public int getSideSize3() {
        return this.sideSize3;
    }
}
