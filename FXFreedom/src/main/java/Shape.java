import javafx.scene.canvas.GraphicsContext;

import java.io.Serializable;

public abstract class Shape implements Serializable {
    private static final long serialVersionUID = 1L;

    private double x;
    private double y;
    private String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw(GraphicsContext gc);

    public abstract void move(double deltaX, double deltaY);

    public abstract void resize(double factor);

}

