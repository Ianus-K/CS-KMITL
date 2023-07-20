public class Circle_650031 {
    public static void main(String[] args) {
        Circle e1 = new Circle();
        System.out.print(e1);
    }
}

class Circle {
    double radius;

    Circle() {
        this.radius = 4;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return radius * 2 * Math.PI;
    }

    public String toString() {
        return "Cirle[radius=" + radius + "]";
    }
}