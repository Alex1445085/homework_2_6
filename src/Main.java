import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 8, 6, 9, 1, 7, 32, 15, 14, 18, 6, 8, 14));
        List<String> words = new ArrayList<>(List.of("op", "qw", "a", "def", "a", "bc", "bc", "def", "def", "qw"));

        //  1. нечетные числа
        for(int i : numbers) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        // 2. четные числа по возрастанию без повторений
        Collections.sort(numbers);
        System.out.println();
        int numberPre = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numberPre < numbers.get(i) && numbers.get(i) % 2 == 0) {
                numberPre = numbers.get(i);
                System.out.print(numbers.get(i) + " ");
            }
        }

        // 3. уникальные слова из списка
        Set<String> wordWithoutRep = new HashSet<>(words);
        System.out.println("\n" + words);
        System.out.println(wordWithoutRep);

        // 4. количество повторов слов в списке
        for (String temp : wordWithoutRep) {
            int count = 0;
            for (String temp2 : words) {
                if (temp.equals(temp2)) { count++; }
            }
            System.out.println(temp + ": " + count);
        }
    }
}