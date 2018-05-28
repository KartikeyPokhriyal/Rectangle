import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RectangleTest {

    Rectangle rectangle;

    @Test

    public void rectangleShouldHaveLengthGreaterThanZero() {

        rectangle = new Rectangle(23.0, 45);

        assertEquals("23.0", String.valueOf(rectangle.getLength()));
    }



}
