////////////////////////////////////////////////////////////////////
// [JACOPO] [SAGGIORO] [2110984]
// [LAURA] [PIERIPOLLI] [2048057]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 3) {
            throw new IllegalArgumentException(
                "Valore numerico non compreso tra 1 e 3");
        }

        int[] values = {1};

        String[] romanSymbols = {"I"};

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