////////////////////////////////////////////////////////////////////
// [JACOPO] [SAGGIORO] [2110984]
// [LAURA] [PIERIPOLLI] [2048057]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvert1() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvert2() {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void testConvert3() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvert4() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvert5() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvert6() {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void testConvert7() {
        assertEquals("VII", IntegerToRoman.convert(7));
    }

    @Test
    public void testConvert8() {
        assertEquals("VIII", IntegerToRoman.convert(8));
    }

    @Test
    public void testConvert9() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvert10() {
        assertEquals("X", IntegerToRoman.convert(10));
    }
}