package readability;

public class WordTests {
    public static void main(String[] args) {
        boolean isTestCompleted = true;
        //"rain" word test
        Word rainWord = new Word("rain");
        int rainWordSyllables = 1;
        if (rainWord.getNumberOfSyllables() != rainWordSyllables) {
            System.out.println("\"Rain\" syllables test failed");
            System.out.println("Result: " + rainWord.getNumberOfSyllables());
            isTestCompleted = false;
        } else {
            System.out.println("\"Rain\" syllables test passed");
        }

        //"side" word test
        Word sideWord = new Word("side");
        int sideWordSyllables = 1;
        if (sideWord.getNumberOfSyllables() != sideWordSyllables) {
            System.out.println("\"Side\" syllables test failed");
            System.out.println("Result: " + sideWord.getNumberOfSyllables());
            isTestCompleted = false;
        } else {
            System.out.println("\"Side\" syllables test passed");
        }

        //"revolutionary" word test
        Word randomWord = new Word("revolutionary");
        int randomWordSyllables = 6;
        if (randomWord.getNumberOfSyllables() != randomWordSyllables) {
            System.out.println("\"revolutionary\" syllables test failed");
            System.out.println("Result: " + randomWord.getNumberOfSyllables());
            isTestCompleted = false;
        } else {
            System.out.println("\"revolutionary\" syllables test passed");
        }

        //vowels test
        char vowel = 'a';
        char nonVowel = 'k';
        if (Word.isVowel(vowel) && !Word.isVowel(nonVowel)) {
            System.out.println("Vowel test passed");
        } else {
            System.out.println("Vowel test failed");
            System.out.println("Word.isVowel('a') =" + Word.isVowel(vowel));
            System.out.println("Word.isVowel('k') =" + Word.isVowel(nonVowel));
            isTestCompleted = false;
        }

        if (isTestCompleted) {
            System.out.println("All tests passed!");
        } else {
            System.out.println("Tests failed!");
        }
    }
}
