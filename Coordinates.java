public class Coordinates {
    
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Coordinates other) {
        int deltaX = this.x - other.x;
        int deltaY = this.y - other.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public Coordinates translate(int dx, int dy) {
        return new Coordinates(this.x + dx, this.y + dy);
    }

    public Coordinates scale(double factor) {
        return new Coordinates((int) (this.x * factor), (int) (this.y * factor));
    }

    public String display() {
        return "Coordinates(" + x + ", " + y + ")";
    }
}
