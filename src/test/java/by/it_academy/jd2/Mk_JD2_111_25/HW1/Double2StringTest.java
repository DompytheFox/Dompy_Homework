package by.it_academy.jd2.Mk_JD2_111_25.HW1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Double2StringTest {

    Double2String double2String = new Double2String();

    @Test
    public void testZero() {
        assertEquals("Ноль", Double2String.toString(0));
        assertEquals("Ноль", Double2String.toString(0.0));
    }

    @Test
    public void testPositiveSingleDigit() {
        assertEquals("Один", Double2String.toString(1));
    }

    @Test
    public void testPositiveTeens() {
        assertEquals("Десять", Double2String.toString(10));
        assertEquals("Девятнадцать", Double2String.toString(19));
    }

    @Test
    public void testPositiveTens() {
        assertEquals("Двадцать", Double2String.toString(20));
    }

    @Test
    public void testPositiveHundreds() {
        assertEquals("Сто", Double2String.toString(100));
    }

    @Test
    public void testPositiveThousands() {
        assertEquals("Одна тысяча", Double2String.toString(1000));
        assertEquals("Две тысячи", Double2String.toString(2000));
        assertEquals("Пять тысяч", Double2String.toString(5000));
    }

    @Test
    public void testPositiveMillions() {
        assertEquals("Один миллион", Double2String.toString(1000000));
        assertEquals("Два миллиона", Double2String.toString(2000000));
        assertEquals("Девять миллионов", Double2String.toString(9000000));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("Минус один", Double2String.toString(-1));
    }

    @Test
    public void testNegativeTeens() {
        assertEquals("Минус десять", Double2String.toString(-10));
        assertEquals("Минус девятнадцать", Double2String.toString(-19));
    }

    @Test
    public void testNegativeTens() {
        assertEquals("Минус двадцать", Double2String.toString(-20));
        assertEquals("Минус девяносто", Double2String.toString(-90));
    }

    @Test
    public void testNegativeHundreds() {
        assertEquals("Минус сто", Double2String.toString(-100));
    }

    @Test
    public void testNegativeThousands() {
        assertEquals("Минус одна тысяча", Double2String.toString(-1000));
        assertEquals("Минус две тысячи", Double2String.toString(-2000));
        assertEquals("Минус девять тысяч", Double2String.toString(-9000));
    }

    @Test
    public void testNegativeMillions() {
        assertEquals("Минус один миллион", Double2String.toString(-1000000));
        assertEquals("Минус три миллиона", Double2String.toString(-3000000));
        assertEquals("Минус девять миллионов", Double2String.toString(-9000000));
    }

    @Test
    public void testIntegerEndings() {
        assertEquals("Одна целая пять десятых", Double2String.toString((1.5)));
        assertEquals("Две целых одна десятая", Double2String.toString((2.1)));
        assertEquals("Одна целая пять сотых", Double2String.toString((1.05)));
        assertEquals("Две целых четырнадцать сотых", Double2String.toString((2.14)));
        assertEquals("Две целых двадцать пять сотых", Double2String.toString((2.25)));
        assertEquals("Три целых двадцать одна сотая", Double2String.toString((3.21)));
    }
}
