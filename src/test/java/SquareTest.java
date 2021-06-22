import org.junit.Test;

public class SquareTest {
    @Test
    public void calulate_fail() {
        int expected = 5;
        int side = 2;
        Square square = new Square(side);
        assertEquals(expected, square.calculateAre());
    }

}