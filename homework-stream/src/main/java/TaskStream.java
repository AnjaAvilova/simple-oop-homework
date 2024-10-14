import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskStream {

    /**
     * Общая сумма по всем книгам.
     *
     * @param books - список книг
     * @return сумма по всем книгам (цена)
     */
    public static double task1(List<Book> books) {
//        double summ = 0;
//        for (Book book : books) {
//            double price = book.getPrice();
//            summ = summ + price;
//        }
        return books.stream()
                .mapToDouble(book -> book.getPrice())
                .sum();

    }

    /**
     * Количество уникальных авторов среди всех книг.
     *
     * @param books - список книг
     * @return количество уникальных авторов
     */
    public static long task2(List<Book> books) {
//        HashSet<String> set = new HashSet<>();
//        for (Book book : books) {
//            String author = book.getAuthor();
//         set.add(author);
//        }
        return books.stream()
                .map(book -> book.getAuthor())
                .distinct()
                .count();
    }

    /**
     * Map в ключе название книги, в значении все отзывы по этой книге.
     *
     * @param books - список книг
     * @return ожидаемый мап
     */
    public static Map<String, List<String>> task3(List<Book> books) {
        return books.stream().collect(Collectors.toMap(book -> book.getTitle(), book -> book.getReviews()));

    }

    /**
     * Map в ключе название книги, в значении все отзывы по этой книге.
     * Дополнительное условие: хранить ключи только тех, у кого есть отзывы
     *
     * @param books - список книг
     * @return ожидаемый мап
     */
    public static Map<String, List<String>> task4(List<Book> books) {
        return books.stream()
                .filter(book -> !book.getReviews().isEmpty())
                .collect(Collectors.toMap(book -> book.getTitle(), book -> book.getReviews()));
    }


    /**
     * Список всех отзывов по всем книгам
     *
     * @param books - список книг
     * @return список отзывов
     */
    public static List<String> task5(List<Book> books) {
        return books.stream()
                .flatMap(book -> book.getReviews().stream())
                .toList();
    }

    /**
     * Определить среднюю стоимость книги (не считая сумму книг)
     *
     * @param books - список книг
     * @return среднюю стоимость книги
     */
    public static double task6(List<Book> books) {
        return books.stream()
                .mapToDouble(book -> book.getPrice())
                .average()
                .orElseThrow();
    }

    /**
     * У всех книг в поле Автор есть слово "Автор"
     *
     * @param books - список книг
     * @return результат
     */
    public static boolean task7(List<Book> books) {
        return books.stream()
                .allMatch(book -> book.getAuthor().contains("Автор"));
    }

    /**
     * Преобразовать List в Set. Где Set - это все названия книг. Достаточно 3
     *
     * @param books - список книг
     * @return не больше 3 названий книг
     */
    public static Set<String> task8(List<Book> books) {
        return books.stream()
                .map(book -> book.getTitle())
                .limit(3)
                .collect(Collectors.toSet());
    }

    /**
     * Найти книги, у которых в названии четная цифра, но цена меньше 100
     *
     * @param books - список книг
     * @return
     */
    public static List<Book> task9(List<Book> books) {
        return books.stream()
                .filter(book -> book.getPrice() < 100)
                .filter(book -> book.getTitle().matches(".*[02468].*"))
                .toList();

    }

    /**
     * Поместить книги в Map по двум ключам: "OK" и "Not Ok". Для "Not Ok" цена у книги больше 50
     *
     * @param books - список книг
     * @return Map с двумя ключами
     */
    public static Map<String, List<Book>> task10(List<Book> books) {
//        Map<String, List<Book>> map = new HashMap<>();
//        List<Book> listOk = new ArrayList<>();
//        List<Book> listNotOk = new ArrayList<>();
//        for (Book book : books) {
//            if (book.getPrice() < 50) {
//                listOk.add(book);
//            } else {
//                listNotOk.add(book);
//            }
//        }
//        map.put("OK", listOk);
//        map.put("Not Ok", listNotOk);
//        return map;

        return books.stream()
                .collect(Collectors.groupingBy(book -> (book.getPrice() < 50 ? "OK" : "Not Ok")));
    }

    /**
     * Получить список книг, у которых хотя бы один отзыв содержит слово "рекомендую".
     *
     * @param books - список книг
     * @return список книг с интересными отзывами
     */
    public static List<Book> task11(List<Book> books) {
        return books.stream()
                .filter(book -> book.getReviews()
                        .stream().anyMatch(review->review.toLowerCase().contains("рекомендую")))
                .toList();
    }

    /**
     * Найти самую дешевую книгу.
     *
     * @param books - список книг
     * @return самая дешевая книга
     */
    public static Book task12(List<Book> books) {
        return books.stream()
                .min(Comparator.comparing(book -> book.getPrice())).orElseThrow();
    }
}


//class Test3 {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 25; i++) {
//            list.add(new Random().nextInt(100));
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 3 == 0;
//            }
//        };
//        list.stream().filter(integer -> integer % 3 == 0).forEach(i -> System.out.print(i + " "));
//    }
//}