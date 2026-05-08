////////////////////////////////////////////////////////////////////
// [JACOPO] [SAGGIORO] [2110984]
// [LAURA] [PIERIPOLLI] [2048057]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        Map<Character, String[]> ascii = new HashMap<>();

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
                " _      ",
                "| |      ",
                "| |      ",
                "| |      ",
                "| |____  ",
                "|______| "
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
                " _____   ",
                "|  __ \\  ",
                "| |  | | ",
                "| |  | | ",
                "| |__| | ",
                "|_____/  "
        });

        ascii.put('M', new String[]{
                " __  __  ",
                "|  \\/  | ",
                "| \\  / | ",
                "| |\\/| | ",
                "| |  | | ",
                "|_|  |_| "
        });

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