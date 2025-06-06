public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Square square = new Square(1, new Coordinates(0, 0));

        System.out.println("Square side length: " + square.getSideLength());
    }
}