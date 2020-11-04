package readability;

public class ReadabilityTests {
    public static int getAge(double score) {
        switch ((int) Math.round(score)) {
            case 1:
                return 6;
            case 2:
                return 7;
            case 3:
                return 9;
            case 4:
                return 10;
            case 5:
                return 11;
            case 6:
                return 12;
            case 7:
                return 13;
            case 8:
                return 14;
            case 9:
                return 15;
            case 10:
                return 16;
            case 11:
                return 17;
            case 12:
                return 18;
            case 13:
                return 24;
            default:
                return 25;
        }
    }

    public static double AutomatedReadabilityIndex(int characters, int words, int sentences) {
        return 4.71 * characters / words +
                0.5 * words / sentences - 21.43;
    }

    public static double FleschKincaidReadabilityTest(int words, int sentences, int syllables) {
        return 0.39 * words / sentences + 11.8 * syllables / words - 15.59;
    }

    public static double SMOGIndex(int polysyllables, int sentences) {
        return 1.043 * Math.sqrt(30.0 * polysyllables / sentences) + 3.1291;
    }

    public static double ColemanLiauIndex(int characters, int sentences, int words) {
        double L = 100.0 * characters / words;
        double S = 100.0 * sentences / words;

        return 0.0588 * L - 0.296 * S - 15.8;
    }
}
