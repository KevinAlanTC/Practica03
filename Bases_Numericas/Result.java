import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'decimalToBase' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER x
     */

    public static String decimalToBase(int n, int x) {
        if (n == 0) return "0";

        StringBuilder resultado = new StringBuilder();
        while (n > 0) {
            int residuo = n % x;
            if (x == 16 && residuo >= 10) {
                // Convertir 10-15 a A-F
                resultado.append((char) ('A' + residuo - 10));
            } else {
                resultado.append(residuo);
            }
            n /= x;
        }

        return resultado.reverse().toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Where x = 2 || x =8 || x = 16

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int x = Integer.parseInt(bufferedReader.readLine().trim());

        String resultado = Result.decimalToBase(n, x);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
