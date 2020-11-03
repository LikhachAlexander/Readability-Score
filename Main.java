package readability;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = args[0];

        String string = Files.readString(Path.of(filePath), StandardCharsets.US_ASCII);

        TextAnalyzer analyzer = new TextAnalyzer(string);
        analyzer.printInfo();
    }
}
