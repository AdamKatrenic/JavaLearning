public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        if (this.radius < 0) {
            radius = 0;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double  area = Math.PI * radius * radius;
        return area;
    }
}
