import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println("======================");
        task2();
        System.out.println("======================");
        task3();
        System.out.println("======================");
        task4();
    }

    public static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

    }

    public static void task2() {
        nums = new ArrayList<>(new HashSet<>(nums));
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void task3() {
        Set<String> uniqeStrings = new HashSet<>(strings);
        System.out.println(uniqeStrings);
    }

    public static void task4() {
        Map<String, Integer> countWords = new HashMap<>();
        for (String string : strings) {
            int wordsCount = 1;
            if (countWords.containsKey(string)) {
                wordsCount = countWords.get(string) + 1;
                countWords.put(string, wordsCount);
            } else {
                countWords.put(string, 1);
            }
        }
        System.out.println(countWords);
    }
}