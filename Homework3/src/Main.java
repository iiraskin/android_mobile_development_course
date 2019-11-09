public class Main {

    public static void main(String[] args) {
        String file = "priest&blonde.txt";
        int[] symbols = SymbolsCount.work(file);

        for (int i = 0; i < symbols.length; ++i) {
            if (symbols[i] != 0) {
                System.out.println((char)i + " " + symbols[i]);
            }
        }
    }
}
