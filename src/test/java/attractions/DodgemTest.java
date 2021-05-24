package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    private Visitor under12;
    private Visitor ticketPrice;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        under12 = new Visitor(10, 119, 20);
        ticketPrice = new Visitor(19, 166, 60);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void priceForUnder12() {
        assertEquals(2.25, dodgems.priceFor(under12), 0.1);
    }

    @Test
    public void ticketPriceForAdult() {
        assertEquals(4.50, dodgems.priceFor(ticketPrice), 0.1);
    }
}
