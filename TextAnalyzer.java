package readability;

import java.util.Locale;

public class TextAnalyzer {
    private Text text;

    public TextAnalyzer(String text) {
        this.text = new Text(text);
    }

    public void setText(String text) {
        this.text = new Text(text);
    }

    public void printText() {
        System.out.println("The text is:");
        System.out.println(text.getText());
        System.out.println();
    }

    public void printWords() {
        System.out.println("Words: " + text.getNumberOfWords());
    }

    public void printSentences() {
        System.out.println("Sentences: " + text.getNumberOfSentences());
    }

    public void printCharacters() {
        System.out.println("Characters: " + text.getNumberOfCharacters());
    }

    public void printSyllables() {
        System.out.println("Syllables: " + text.getNumberOfSyllables());
    }

    public void printPolysyllables() {
        System.out.println("Polysyllables: " + text.getNumberOfPolysyllables());
    }

    public void printInfo() {
        printText();
        printWords();
        printSentences();
        printCharacters();
        printSyllables();
        printPolysyllables();
    }

    public void printScore(String option) {
        double ARIScore = ReadabilityTests.AutomatedReadabilityIndex(text.getNumberOfCharacters(), text.getNumberOfWords(), text.getNumberOfSentences());
        int ARIAge = ReadabilityTests.getAge(ARIScore);
        double FKRTScore = ReadabilityTests.FleschKincaidReadabilityTest(text.getNumberOfWords(), text.getNumberOfSentences(), text.getNumberOfSyllables());
        int FKRTAge = ReadabilityTests.getAge(FKRTScore);
        double SMOGScore = ReadabilityTests.SMOGIndex(text.getNumberOfPolysyllables(), text.getNumberOfSentences());
        int SMOGAge = ReadabilityTests.getAge(SMOGScore);
        double CLIScore = ReadabilityTests.ColemanLiauIndex(text.getNumberOfCharacters(), text.getNumberOfSentences(), text.getNumberOfWords());
        int CLIAge = ReadabilityTests.getAge(CLIScore);
        System.out.println();
        if (option.equals("ARI") || option.equals("all")) {
            System.out.print("Automated Readability Index: ");
            System.out.printf(Locale.US, "%.2f ", ARIScore);
            System.out.print("(about " + ARIAge + " year olds).\n");
        }
        if (option.equals("FK") || option.equals("all")) {
            System.out.print("Flesch–Kincaid readability tests: ");
            System.out.printf(Locale.US, "%.2f ", FKRTScore);
            System.out.print("(about " + FKRTAge + " year olds).\n");
        }
        if (option.equals("SMOG") || option.equals("all")) {
            System.out.print("Simple Measure of Gobbledygook: ");
            System.out.printf(Locale.US, "%.2f ", SMOGScore);
            System.out.print("(about " + SMOGAge + " year olds).\n");
        }
        if (option.equals("CL") || option.equals("all")) {
            System.out.print("Coleman–Liau index: ");
            System.out.printf(Locale.US, "%.2f ", CLIScore);
            System.out.print("(about " + CLIAge + " year olds).\n");
        }
        if (option.equals("all")) {
            double average = (ARIAge + FKRTAge + SMOGAge + CLIAge) / 4.0;
            System.out.print("This text should be understood in average by ");
            System.out.printf(Locale.US, "%.2f ", average);
            System.out.println(" year olds.");
        }
    }
}