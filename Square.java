public class Square extends Shape {
    
    private int sideLength;

    public Square(int sideLength) {
        super(4, new Coordinates(0, 0));
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

}
