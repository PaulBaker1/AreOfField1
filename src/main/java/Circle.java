public class Circle implements Shape{
    int r;
    // Constructor
    public Circle(int r){
        this.r = r;
    }
    // Method
    @Override
    public double calculateAre() {
        return Math.PI * r * r;
    }
}
