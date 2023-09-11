import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.tw.bootcamp.Rectangle;

public class AreaOfRectangleTest {

    @Test
    public void shouldCorrectlyCalculateAreaOfRectangle() {
        final int len = 10;
        final int breadth = 10;

        final Rectangle rectangle = new Rectangle(len, breadth);
        double area = rectangle.calculateArea();

        assertEquals(100, area);
    }
}
