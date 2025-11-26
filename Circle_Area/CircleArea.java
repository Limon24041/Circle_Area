import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = input.nextDouble();

        Circle circle = new Circle(r);

        System.out.println("Radius: " + circle.getRadius());
        System.out.printf("Area of the circle: %.2f\n", circle.computeArea());
    }
}
