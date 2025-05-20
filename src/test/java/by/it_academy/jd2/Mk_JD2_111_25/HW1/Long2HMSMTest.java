package by.it_academy.jd2.Mk_JD2_111_25.HW1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Long2HMSMTest {

    Long2HMSM long2HMSM = new Long2HMSM();

    @Test
    public void testToHMSM_ShortFormat() {

        assertEquals("00:00:00.000", Long2HMSM.toHoursMinuteSecondMillisecond(0, true));
        assertEquals("00:01:00.000", Long2HMSM.toHoursMinuteSecondMillisecond(60000, true));
        assertEquals("01:00:00.000", Long2HMSM.toHoursMinuteSecondMillisecond(3600000, true));
        assertEquals("01:01:01.001", Long2HMSM.toHoursMinuteSecondMillisecond(3661001, true));
        assertEquals("10:00:00.000", Long2HMSM.toHoursMinuteSecondMillisecond(36000000, true));

        assertEquals("00:00:00.001", Long2HMSM.toHoursMinuteSecondMillisecond(1, true));
        assertEquals("00:00:00.999", Long2HMSM.toHoursMinuteSecondMillisecond(999, true));
        assertEquals("00:00:01.000", Long2HMSM.toHoursMinuteSecondMillisecond(1000, true));
        assertEquals("00:59:59.999", Long2HMSM.toHoursMinuteSecondMillisecond(3599999, true));
    }

    @Test
    public void testToHMSM_LongFormat() {

        assertEquals("6 часов 2 минуты 3 секунды 0 миллисекунд ", Long2HMSM.toHoursMinuteSecondMillisecond(21723000, false));
        assertEquals("0 часов 1 минута 0 секунд 0 миллисекунд ", Long2HMSM.toHoursMinuteSecondMillisecond(60000, false));
        assertEquals("1 час 0 минут 0 секунд 0 миллисекунд ", Long2HMSM.toHoursMinuteSecondMillisecond(3600000, false));
        assertEquals("1 час 1 минута 1 секунда 1 миллисекунда ", Long2HMSM.toHoursMinuteSecondMillisecond(3661001, false));
        assertEquals("10 часов 4 минуты 0 секунд 6 миллисекунд ", Long2HMSM.toHoursMinuteSecondMillisecond(36240006, false));
        assertEquals("4 часа 7 минут 2 секунды 4 миллисекунды ", Long2HMSM.toHoursMinuteSecondMillisecond(14822004, false));
        assertEquals("4 часа 7 минут 5 секунд 2 миллисекунды ", Long2HMSM.toHoursMinuteSecondMillisecond(14825002, false));
    }


}

