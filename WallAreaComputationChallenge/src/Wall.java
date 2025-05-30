public class Wall {
    double width;
    double height;

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;

        if (width <= 0 || height <= 0) {
            width = 0;
            height = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
