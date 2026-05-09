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

    @Test
    public void testConvert11() {
        assertEquals("XI", IntegerToRoman.convert(11));
    }

    @Test
    public void testConvert12() {
        assertEquals("XII", IntegerToRoman.convert(12));
    }

    @Test
    public void testConvert13() {
        assertEquals("XIII", IntegerToRoman.convert(13));
    }

    @Test
    public void testConvert14() {
        assertEquals("XIV", IntegerToRoman.convert(14));
    }

    @Test
    public void testConvert15() {
        assertEquals("XV", IntegerToRoman.convert(15));
    }

    @Test
    public void testConvert16() {
        assertEquals("XVI", IntegerToRoman.convert(16));
    }

    @Test
    public void testConvert17() {
        assertEquals("XVII", IntegerToRoman.convert(17));
    }

    @Test
    public void testConvert18() {
        assertEquals("XVIII", IntegerToRoman.convert(18));
    }

    @Test
    public void testConvert19() {
        assertEquals("XIX", IntegerToRoman.convert(19));
    }

    @Test
    public void testConvert20() {
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test 
    public void testConvert40() { 
        assertEquals("XL", IntegerToRoman.convert(40)); 
    }

    @Test 
    public void testConvert50() { 
        assertEquals("L", IntegerToRoman.convert(50)); 
    }
    
}