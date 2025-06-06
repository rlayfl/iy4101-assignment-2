public class Square extends Shape {
    
    private int sideLength;

    public Square(int sideLength, Coordinates centre) {
        super(4, centre);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }
}
