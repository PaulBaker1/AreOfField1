public class AreOfField {
    // Pola i Metody Fields(Memebers) and Methods
    public static void main(String[] args) {
        Square kwadrat = new Square(5);
        Square drugikwadrat = new Square(5);
        Circle kolo = new Circle(3);
        Rectangual prostokat = new Rectangual(2, 3);
        kwadrat.i = 10;
        System.out.println("Square " + drugikwadrat.calculateAre() + " i: " + Square.i);
        drugikwadrat.side = 4;
        drugikwadrat.i = 20;
        System.out.println("Square " + drugikwadrat.calculateAre());
        System.out.println("Test1: " + drugikwadrat.i + " kolo: " + kwadrat.i);
        calculate(drugikwadrat);
        calculate(kolo);
        calculate(prostokat);
    }
    public static void calculate(Shape test6){
        System.out.println("Calculated: " + test6.calculateAre());

    }
}