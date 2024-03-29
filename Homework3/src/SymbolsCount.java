import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SymbolsCount {
    public static int[] work(String fileName) {
        //Возможно, задание предполагало использование Collections,
        // но, мне кажется, тут лучше и проще использовать обычный массив
        int[] counter = new int[Character.MAX_VALUE];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int symbol = reader.read();
            while (symbol != -1) {
                counter[symbol] += 1;
                symbol = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }
}