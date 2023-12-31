import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.tw.bootcamp.Rectangle;

public class RectangleTest {
    @Test
    public void shouldReturnAreaForValidLengthAndBreadth() {
        final int length = 10;
        final int breadth = 10;
        final Rectangle rectangle = new Rectangle(length, breadth);

        double area = rectangle.area();

        assertEquals(100, area);
    }

    @Test
    void shouldReturnPerimeterForValidLengthAndBreadth() {
        int length = 10;
        int breadth = 5;
        Rectangle rectangle = new Rectangle(length, breadth);

        double perimeter = rectangle.perimeter();

        assertEquals(30, perimeter);
    }

    @Test
    void shouldNotAllowToCreateRectangleWithNegativeLength() {
        int length = -10;
        int breadth = 5;

        assertThrows(IllegalArgumentException.class, () -> new Rectangle(length, breadth));
    }

    @Test
    void shouldNotAllowToCreateRectangleWithNegativeBreadth() {
        int length = 10;
        int breadth = -5;

        assertThrows(IllegalArgumentException.class, () -> new Rectangle(length, breadth));
    }

    @Test
    void shouldNotAllowToCreateRectangleWithZeroLength() {
        int length = 0;
        int breadth = 5;

        assertThrows(IllegalArgumentException.class, () -> new Rectangle(length, breadth));
    }

    @Test
    void shouldNotAllowToCreateRectangleWithZeroBreadth() {
        int length = 10;
        int breadth = 0;

        assertThrows(IllegalArgumentException.class, () -> new Rectangle(length, breadth));
    }
}
