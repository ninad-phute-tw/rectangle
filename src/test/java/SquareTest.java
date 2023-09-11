import org.junit.jupiter.api.Test;
import org.tw.bootcamp.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void shouldReturnArea100ForSide10() {
        final int side = 10;
        Square square = new Square(side);

        double area = square.area();

        assertEquals(100, area);
    }

    @Test
    public void shouldReturnPerimeter40ForSide10() {
        final int side = 10;
        Square square = new Square(side);

        double area = square.perimeter();

        assertEquals(40, area);
    }
}
