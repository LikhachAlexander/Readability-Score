package readability;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = args[0];

        String string = Files.readString(Path.of(filePath), StandardCharsets.US_ASCII);

        TextAnalyzer analyzer = new TextAnalyzer(string);
        analyzer.printInfo();

        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.next();
        analyzer.printScore(option);
    }
}
