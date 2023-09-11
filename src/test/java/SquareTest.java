import org.junit.jupiter.api.Test;
import org.tw.bootcamp.Rectangle;
import org.tw.bootcamp.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void shouldNotAllowToCreateSquareWithNegativeSide() {
        final int side = -1;

        assertThrows(IllegalArgumentException.class, () -> new Square(side));
    }

    @Test
    void shouldNotAllowToCreateSquareWithZeroSide() {
        final int side = 0;

        assertThrows(IllegalArgumentException.class, () -> new Square(side));
    }
}
