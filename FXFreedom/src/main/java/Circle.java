
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, double radius, String color) {
        super();
        this.radius = radius;
    }

    @Override
    public void draw(GraphicsContext gc) {
        // Draw circle on canvas
    }

    @Override
    public void move(double deltaX, double deltaY) {
        // Move circle
    }

    @Override
    public void resize(double factor) {
        // Resize circle
    }

    // Getters and setters
    // ...
}

