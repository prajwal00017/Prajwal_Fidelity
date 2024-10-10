class AreaCalculator {
    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }
}

public class question5 {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        double squareArea = areaCalculator.calculateArea(5.0);
        System.out.println("Area of Square: " + squareArea);

        double rectangleArea = areaCalculator.calculateArea(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangleArea);

        double circleArea = areaCalculator.calculateArea(3.0, true);
        System.out.println("Area of Circle: " + circleArea);
    }
}