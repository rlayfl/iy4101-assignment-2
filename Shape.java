public class Shape {

    private int noOfSides;
    private Coordinates centre;

    public Shape(int noOfSides, Coordinates centre) {
        this.noOfSides = noOfSides;
        this.centre = centre;
    }

    public Coordinates getCoordinates() {
        return centre;
    }

    public int getNoOfSides() {
        return noOfSides;
    }

    public void setCoordinates(Coordinates centre) {
        this.centre = centre;
    }

    public void translate(int dx, int dy) {
        this.centre = centre.translate(dx, dy);
    }

    public void scale(double factor) {
        this.centre = centre.scale(factor);
    }

    public double getArea() {
        // Default implementation, can be overridden by subclasses
        return 0.0;
    }

    public double getPerimeter() {
        // Default implementation, can be overridden by subclasses
        return 0.0;
    }

    public String display() {
        return "Shape with " + noOfSides + " sides at " + centre.display();
    }
}