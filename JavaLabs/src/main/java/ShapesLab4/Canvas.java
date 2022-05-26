package ShapesLab4;

import javafx.geometry.Point2D;
import java.util.ArrayList;

public class Canvas {

    private ArrayList<Shape> shapes;

    public Canvas() {
        shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    // Didn't specify how a shape can be identified.
    // So we will use the object reference value.
    // Return true if the shape is found and removed.
    public boolean removeShape(Shape s) {
        if (shapes.contains(s)) {
            shapes.remove(s);
            return true;
        }
        return false;
    }

    public Shape getShape(Point2D p) {
        double distance, minDistance = Double.MAX_VALUE;
        Shape closestShape = null;

        for (Shape s : shapes) {
            distance = s.getStart().distance(p);
            if (distance < minDistance) {
                minDistance = distance;
                closestShape = s;
            }
        }
        return closestShape;
    }

    public void drawAll() {
        for (Shape s : shapes)
            s.draw();
    }

}
