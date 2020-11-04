package readability;

public class Word {
    private final String word;

    public static final char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};

    public Word(String word) {
        this.word = word.strip();
    }

    public String getWord() {
        return word;
    }

    public int getNumberOfCharacters() {
        return word.length();
    }

    public static boolean isVowel(char b) {
        char a = Character.toLowerCase(b);
        for (char vowel : vowels) {
            if (a == vowel) {
                return true;
            }
        }
        return false;
    }

    public int getNumberOfSyllables() {
        int syllables = 0;
        boolean isSyllable = false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isVowel(c) && !isSyllable) {
                syllables++;
                isSyllable = true;
            } else if (!isVowel(c)){
                isSyllable = false;
            }
        }
        if (word.charAt(word.length() - 1) == 'e') {
            syllables--;
        }
        if (syllables == 0) {
            syllables++;
        }
        return syllables;
    }

    public boolean isPolysyllable() {
        return getNumberOfSyllables() >= 3;
    }
}
