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

    public double calculateARI() {
        return 4.71 * text.getNumberOfCharacters() / text.getNumberOfWords() +
                0.5 * text.getNumberOfWords() / text.getNumberOfSentences() - 21.43;
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

    public void printARIScore() {
        System.out.print("The score is: ");
        System.out.print(String.format(Locale.US, "%.2f\n", calculateARI()));
    }

    public static String getARIHint(int score) {
        switch (score) {
            case 1:
                return "This text should be understood by 5-6 year olds.";
            case 2:
                return "This text should be understood by 6-7 year olds.";
            case 3:
                return "This text should be understood by 7-9 year olds.";
            case 4:
                return "This text should be understood by 9-10 year olds.";
            case 5:
                return "This text should be understood by 10-11 year olds.";
            case 6:
                return "This text should be understood by 11-12 year olds.";
            case 7:
                return "This text should be understood by 12-13 year olds.";
            case 8:
                return "This text should be understood by 13-14 year olds.";
            case 9:
                return "This text should be understood by 14-15 year olds.";
            case 10:
                return "This text should be understood by 15-16 year olds.";
            case 11:
                return "This text should be understood by 16-17 year olds.";
            case 12:
                return "This text should be understood by 17-18 year olds.";
            case 13:
                return "This text should be understood by 18-24 year olds.";
            default:
                return "This text should be understood by 24+ year olds.";
        }
    }

    public void printAuditory() {
        int score = (int) Math.ceil(calculateARI());
        System.out.println(getARIHint(score));
    }

    public void printInfo() {
        printText();
        printWords();
        printSentences();
        printCharacters();
        printARIScore();
        printAuditory();
    }
}
