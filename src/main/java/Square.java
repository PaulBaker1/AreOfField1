public class Square implements Shape {
    static int i = 2;
    double side;
    // Constructor
    public Square(double side) {
        this.side = side;
    }
    // Methoda
    @Override
    public double calculateAre() {
        return side * side;
    }
}
