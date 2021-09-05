package interfaceShape;

// Represents rectangle shapes.
public class Rectangle implements Shape {
    private double width;
    private double height;
    
    // Constructs a new rectangle with the given dimensions.
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getPerimeter() {
    	return width + height + width + height;
    }
    public double getArea() {
    	return width * height;
    }

}
