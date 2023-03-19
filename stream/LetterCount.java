package stream;

import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {
        getTotalNumberOfLettersOfNamesLongerThanFive("furkan", "java", "practice");
    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .filter(name -> name.length() > 5)
                .mapToInt(String::length)
                .sum();
    }
}
