////////////////////////////////////////////////////////////////////
// [JACOPO] [SAGGIORO] [2110984]
// [LAURA] [PIERIPOLLI] [2048057]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 6) {
            throw new IllegalArgumentException(
                "Valore numerico non compreso tra 1 e 6");
        }

        int[] values = {5, 4, 1};

        String[] romanSymbols = {"V", "IV", "I"};

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