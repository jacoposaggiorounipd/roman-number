////////////////////////////////////////////////////////////////////
// [JACOPO] [SAGGIORO] [2110984]
// [LAURA] [PIERIPOLLI] [2048057]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {
    private static final Map<Character, String[]> ascii = new HashMap<>();

    static {
        ascii.put('I', new String[]{
                "  _____ ",
                " |_   _|",
                "   | |  ",
                "   | |  ",
                "  _| |_ ",
                " |_____|"
        });

        ascii.put('V', new String[]{
                " __      __",
                " \\ \\    / /",
                "  \\ \\  / / ",
                "   \\ \\/ /  ",
                "    \\  /   ",
                "     \\/    "
        });

        ascii.put('X', new String[]{
                " __   __",
                " \\ \\ / /",
                "  \\ V / ",
                "   > <  ",
                "  / . \\ ",
                " /_/ \\_\\"
        });

        ascii.put('L', new String[]{
                "  _      ",
                " | |     ",
                " | |     ",
                " | |     ",
                " | |____ ",
                " |______|"
        });

        ascii.put('C', new String[]{
                "   _____ ",
                "  / ____|",
                " | |     ",
                " | |     ",
                " | |____ ",
                "  \\_____|"
        });

        ascii.put('D', new String[]{
                "  _____  ",
                " |  __ \\ ",
                " | |  | |",
                " | |  | |",
                " | |__| |",
                " |_____/ "
        });

        ascii.put('M', new String[]{
                "  __  __ ",
                " |  \\/  |",
                " | \\  / |",
                " | |\\/| |",
                " | |  | |",
                " |_|  |_|"
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void printNumberBelow0ShouldThrowException() {
        RomanPrinter.print(0);
    }

    @Test
    public void print1ShouldReturnAsciiI() {
        assertRoman(1, "I");
    }

    @Test
    public void print2ShouldReturnAsciiII() {
        assertRoman(2, "II");
    }

    @Test
    public void print3ShouldReturnAsciiIII() {
        assertRoman(3, "III");
    }

    @Test
    public void print4ShouldReturnAsciiIV() {
        assertRoman(4, "IV");
    }

    @Test
    public void print5ShouldReturnAsciiV() {
        assertRoman(5, "V");
    }

    @Test
    public void print6ShouldReturnAsciiVI() {
        assertRoman(6, "VI");
    }

    @Test
    public void print7ShouldReturnAsciiVII() {
        assertRoman(7, "VII");
    }

    @Test
    public void print8ShouldReturnAsciiVIII() {
        assertRoman(8, "VIII");
    }

    @Test
    public void print9ShouldReturnAsciiIX() {
        assertRoman(9, "IX");
    }

    @Test
    public void print10ShouldReturnAsciiX() {
        assertRoman(10, "X");
    }

    @Test
    public void print11ShouldReturnAsciiXI() {
        assertRoman(11, "XI");
    }

    @Test
    public void print14ShouldReturnAsciiXIV() {
        assertRoman(14, "XIV");
    }

    @Test
    public void print15ShouldReturnAsciiXV() {
        assertRoman(15, "XV");
    }

    @Test
    public void print19ShouldReturnAsciiXIX() {
        assertRoman(19, "XIX");
    }

    @Test
    public void print20ShouldReturnAsciiXX() {
        assertRoman(20, "XX");
    }

    @Test
    public void print40ShouldReturnAsciiXL() {
        assertRoman(40, "XL");
    }

    @Test
    public void print50ShouldReturnAsciiL() {
        assertRoman(50, "L");
    }

    @Test
    public void print90ShouldReturnAsciiXC() {
        assertRoman(90, "XC");
    }

    @Test
    public void print99ShouldReturnAsciiXCIX() {
        assertRoman(99, "XCIX");
    }

    @Test
    public void print100ShouldReturnAsciiC() {
        assertRoman(100, "C");
    }

    @Test
    public void print400ShouldReturnAsciiCD() {
        assertRoman(400, "CD");
    }

    @Test
    public void print444ShouldReturnAsciiCDXLIV() {
        assertRoman(444, "CDXLIV");
    }

    @Test
    public void print499ShouldReturnAsciiCDXCIX() {
        assertRoman(499, "CDXCIX");
    }

    @Test
    public void print500ShouldReturnAsciiD() {
        assertRoman(500, "D");
    }

    @Test
    public void print900ShouldReturnAsciiCM() {
        assertRoman(900, "CM");
    }

    @Test
    public void print999ShouldReturnAsciiCMXCIX() {
        assertRoman(999, "CMXCIX");
    }

    @Test
    public void print1000ShouldReturnAsciiM() {
        assertRoman(1000, "M");
    }

    @Test(expected = IllegalArgumentException.class)
    public void printNumberAbove1000ShouldThrowException() {
        RomanPrinter.print(1001);
    }

    private void assertRoman(int number, String romanNumber) {
        String expected = buildAscii(romanNumber);
        String result = RomanPrinter.print(number);
        assertEquals(expected, result);
    }

    private String buildAscii(String romanNumber) {
        StringBuilder[] rows = new StringBuilder[6];
        for (int i = 0; i < 6; i++) {
            rows[i] = new StringBuilder();
        }

        for (int r = 0; r < 6; r++) {
            for (char c : romanNumber.toCharArray()) {
                rows[r].append(ascii.get(c)[r]);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int r = 0; r < 6; r++) {
            result.append(rows[r]);
            if (r < 5) {
                result.append("\n");
            }
        }

        return result.toString();
    }
}