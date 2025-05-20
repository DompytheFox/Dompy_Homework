package by.it_academy.jd2.Mk_JD2_111_25.HW1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Int2StringTest {

    Int2String int2String = new Int2String();

    @Test
    public void testZero() {
        assertEquals("Ноль", Int2String.toString(0));
    }

    @Test
    public void testPositiveSingleDigit() {
        assertEquals("Один", Int2String.toString(1));
    }

    @Test
    public void testPositiveTeens() {
        assertEquals("Десять", Int2String.toString(10));
        assertEquals("Девятнадцать", Int2String.toString(19));
    }

    @Test
    public void testPositiveTens() {
        assertEquals("Двадцать", Int2String.toString(20));
    }

    @Test
    public void testPositiveHundreds() {
        assertEquals("Сто", Int2String.toString(100));
    }

    @Test
    public void testPositiveThousands() {
        assertEquals("Одна тысяча", Int2String.toString(1000));
        assertEquals("Две тысячи", Int2String.toString(2000));
        assertEquals("Пять тысяч", Int2String.toString(5000));
    }

    @Test
    public void testPositiveMillions() {
        assertEquals("Один миллион", Int2String.toString(1000000));
        assertEquals("Два миллиона", Int2String.toString(2000000));
        assertEquals("Девять миллионов", Int2String.toString(9000000));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("Минус один", Int2String.toString(-1));
    }

    @Test
    public void testNegativeTeens() {
        assertEquals("Минус десять", Int2String.toString(-10));
        assertEquals("Минус девятнадцать", Int2String.toString(-19));
    }

    @Test
    public void testNegativeTens() {
        assertEquals("Минус двадцать", Int2String.toString(-20));
        assertEquals("Минус девяносто", Int2String.toString(-90));
    }

    @Test
    public void testNegativeHundreds() {
        assertEquals("Минус сто", Int2String.toString(-100));
    }

    @Test
    public void testNegativeThousands() {
        assertEquals("Минус одна тысяча", Int2String.toString(-1000));
        assertEquals("Минус две тысячи", Int2String.toString(-2000));
        assertEquals("Минус девять тысяч", Int2String.toString(-9000));
    }

    @Test
    public void testNegativeMillions() {
        assertEquals("Минус один миллион", Int2String.toString(-1000000));
        assertEquals("Минус три миллиона", Int2String.toString(-3000000));
        assertEquals("Минус девять миллионов", Int2String.toString(-9000000));
    }
}
