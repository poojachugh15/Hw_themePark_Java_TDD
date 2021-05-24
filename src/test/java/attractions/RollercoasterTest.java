package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    private Visitor adultTall;
    private Visitor adultShort;
    private  Visitor young;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        adultTall = new Visitor(25, 200, 50);
        adultShort = new Visitor(20, 135,40);
        young = new Visitor(10, 145, 50);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowToTallAdult() {
        assertEquals(true, rollerCoaster.isAllowedTo(adultTall));
    }

    @Test
    public void isNotAllowToShortAdult() {
        assertEquals(false, rollerCoaster.isAllowedTo(adultShort));
    }

    @Test
    public void isNotAllowToYoung() {
        assertEquals(false, rollerCoaster.isAllowedTo(young));
    }

    @Test
    public void startingTicketPrice() { assertEquals(8.40, rollerCoaster.ticketPrice(adultShort), 0.01); }

    @Test
    public void priceForAdultTall() {
        assertEquals(16.80, rollerCoaster.ticketPrice(adultTall), 0.01);}
}
