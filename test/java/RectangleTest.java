import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.tw.bootcamp.Rectangle;

public class RectangleTest {

    @Test
    public void shouldReturnAreaOfRectangleWithValidInput() {
        final int length = 10;
        final int breadth = 10;

        final Rectangle rectangle = new Rectangle(length, breadth);
        double area = rectangle.area();

        assertEquals(100, area);
    }
}
