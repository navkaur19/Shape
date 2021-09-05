package interfaceShape;

// Represents circle shapes.
public class Circle implements Shape {
    private double radius;
    
    // Constructs a new circle with the given radius.
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getPerimeter() {
    	return 2 * 3.14 * radius;
    }
    
    public double getArea() {
    	return 3.14 * (radius * radius);
    }
    
}
