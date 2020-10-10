package readability;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] sentences = str.split("[!.?]");
        int total = 0;
        for(String sentence: sentences) {
            String[] words = sentence.strip().split(" ");
            total += words.length;
        }
        float average = (float) total / sentences.length;
        if (average <= 10f) {
            System.out.println("EASY");
        } else {
            System.out.println("HARD");
        }
    }
}
