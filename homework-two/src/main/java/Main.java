import java.io.StringBufferInputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        printStringReverse("\n");
//        printWordsReverselnColumn("hello world");
//        printSubStringRevers("Привет я из Самары", 4, 9);
//        System.out.println(getWordsReverse("Я из Москвы"));
//        printWordsReverselnColumn("и тебе привет");
        System.out.println(maxCharIndex("ddcccabbbb"));
    }


    public static void printStringReverse(String string) {
        if (string == null || string.isBlank()) {
            System.out.println("Wrong string");
        }
        StringBuilder builder = new StringBuilder(string);
        System.out.println(builder.reverse());
    }


    public static boolean isPhoneNumber(String string) {
        if (string == null || string.isBlank()) {
            System.out.println("Wrong string");
        }
        return string.matches("^8\\d{10}");

    }


    public static void printSubStringRevers(String string, int start, int finish) {
        if (string == null || string.isBlank() ||
                start < 0 || start > string.length() ||
                finish < 0 || finish > string.length() ||
                start > finish) {
            System.out.println("Wrong string");
        }
        String substring = string.substring(0, start);
        String substring2 = string.substring(start, finish + 1);
        String substring3 = string.substring(finish + 1);

        StringBuilder stringBuilder = new StringBuilder(substring2);
        stringBuilder.reverse();
        String result = substring + stringBuilder + substring3;
        System.out.println(result);
    }


    public static String getWordsReverse(String string) {
        if (string == null || string.isBlank()) {
            System.out.println("Wrong string");
        }
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length / 2; i++) {
            String temp = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = temp;
        }
        String join = String.join(" ", strings);
        return join;
    }


    public static String getWordsReverseInColumn(String string) {
        if (string == null || string.isBlank()) {
            System.out.println("Wrong string");
        }
        StringBuilder stringBuilder = new StringBuilder(string).reverse();
        String string1 = stringBuilder.toString();
        String[] strings = string1.split(" ");
        for (int i = 0; i < strings.length / 2; i++) {
            String temp = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = temp;
        }
        String join = String.join(System.lineSeparator(), strings);
        return join;
    }


    public static int maxCharIndex1(String string) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char charAt = string.charAt(i);
            String string1 = String.valueOf(charAt);

            if (!map.containsKey(string1)) {
                map.put(string1, 1);
            } else {
                int value = map.get(string1);
                map.put(string1, value + 1);
            }
        }
        Collection<Integer> values = map.values();
        Integer max = values.stream().max(Comparator.naturalOrder()).orElseThrow();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        String temp = "";
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(max)) {
                temp = entry.getKey();
            }
        }
        return string.indexOf(temp);
    }

    public static int maxCharIndex(String string) {
//        Map<String, Integer> map = new HashMap<>();
//        for (char aChar : string.toCharArray()) {
//            map.merge(String.valueOf(aChar), 1, (oldValue, newValue) -> oldValue + newValue);
//        }
        Map<String, Long> map = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));

        return string.indexOf(map.entrySet().stream()
                .filter(entry -> entry.getValue().equals(Collections.max(map.values())))
                .findFirst()
                .orElseThrow()
                .getKey());
    }

}



