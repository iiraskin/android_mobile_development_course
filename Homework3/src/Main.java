import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String file = "priest&blonde.txt";
        int[] symbols = SymbolsCount.work(file);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {
            for (int i = 0; i < symbols.length; ++i) {
                if (symbols[i] != 0) {
                    writer.write((char)i + " " + symbols[i] + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
