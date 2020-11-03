package readability;

public class Word {
    private final String word;

    public Word(String word) {
        this.word = word.strip();
    }

    public String getWord() {
        return word;
    }

    public int getNumberOfCharacters() {
        return word.length();
    }
}
