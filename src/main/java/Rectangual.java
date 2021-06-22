public class Rectangual implements Shape{
    int a;
    int b;
    // Constructor
    public Rectangual(int a, int b) {
        this.a = a;
        this.b = b;
    }
    // Methode
    public double calculateAre() {
        return a * b;
    }
}
