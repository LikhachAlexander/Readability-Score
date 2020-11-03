package readability;

public class Sentence {
    private final Word[] words;

    public Sentence(String sentence) {
        String[] sentenceWords = sentence.strip().split(" ");
        Word[] wordArray = new Word[sentenceWords.length];

        for (int i = 0; i < sentenceWords.length; i++) {
            wordArray[i] = new Word(sentenceWords[i]);
        }
        this.words = wordArray;
    }

    public int getNumberOfWords() {
        return words.length;
    }

    public int getNumberOfCharacters() {
        int total = 0;
        for (Word word:
             words) {
            total += word.getNumberOfCharacters();
        }
        return total;
    }

    public String getSentenceText() {
        StringBuilder text = new StringBuilder();
        for (Word word:
             words) {
            text.append(word).append(" ");
        }
        return text.toString().stripTrailing();
    }
}
