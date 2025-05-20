package by.it_academy.jd2.Mk_DompytheFox_111_25.HW1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Int2WeekTest {
    Int2Week int2Week = new Int2Week();

    @Test
    public void testZeroDays() {
        assertEquals("0 недель", Int2Week.toString(0));
    }

    @Test
    public void testOneWeek() {
        assertEquals("1 неделя", Int2Week.toString(7));
    }

    @Test
    public void testTwoWeeks() {
        assertEquals("2 недели", Int2Week.toString(14));
    }

    @Test
    public void testSixWeek() {
        assertEquals("6 недель", Int2Week.toString(42));
    }

    @Test
    public void testNegativeDays() {
        assertEquals("0 недель", Int2Week.toString(-1));
    }
}
