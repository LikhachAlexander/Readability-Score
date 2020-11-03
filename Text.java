package readability;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    private final Sentence[] sentences;
    private final String stringText;

    public Text(String text) {
        this.stringText = text;
        String[] stringSentences = text.split("[!.?]");
        Sentence[] textSentences = new Sentence[stringSentences.length];

        for (int i = 0; i < stringSentences.length; i++) {
            textSentences[i] = new Sentence(stringSentences[i]);
        }
        this.sentences = textSentences;
    }

    public String getText() {
        return stringText;
    }

    public int getNumberOfWords() {
        int total = 0;
        for (Sentence sentence:
             sentences) {
            total += sentence.getNumberOfWords();
        }
        return total;
    }

    public int getNumberOfCharacters() {
        int total = 0;
        for (Sentence sentence:
                sentences) {
            total += sentence.getNumberOfCharacters();
        }
        Pattern pattern = Pattern.compile("[.!?]");
        Matcher matcher = pattern.matcher(stringText);
        int matches = (int) matcher.results().count();
        return total + matches;
    }

    public int getNumberOfSentences() {
        return sentences.length;
    }

}
