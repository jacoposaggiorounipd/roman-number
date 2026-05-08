////////////////////////////////////////////////////////////////////
// [JACOPO] [SAGGIORO] [2110984]
// [LAURA] [PIERIPOLLI] [2048057]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException(
                "Valore numerico non compreso tra 1 e 100");
        }

        int[] values = {
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] romanSymbols = {
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                result.append(romanSymbols[i]);
                number -= values[i];
            }
        }
        
        return result.toString();
    }
}