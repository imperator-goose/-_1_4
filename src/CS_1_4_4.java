import java.util.HashMap;
import java.util.Map;

public class CS_1_4_4 {
    public static boolean isPalindrome(String str) {
        return str.contentEquals(new StringBuilder(str).reverse());
    }
    public static String buildPalindrome(String input) {
        if(isPalindrome(input)){
            return input;
        }

        Map<Character, Integer> map = new HashMap<>();


        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        char centralChar = '5';


        boolean central = false;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (count % 2 != 0 && centralChar == '5' && !central) {
                centralChar = c;
                count--;
                central = true;
            }

            if (count % 2 != 0 && centralChar != '5') {
                return "Нет решения";
            }

            int half = count / 2;
            left.append(String.valueOf(c).repeat(half));
            right.insert(0, String.valueOf(c).repeat(half));
        }

        String palindrome;
        if (centralChar != '5' && central) {
            palindrome = left.toString() + centralChar + right;
        } else {
            palindrome = left.toString() + right;
        }

        return palindrome;
    }

    public static void main(String[] args) {
        System.out.println(buildPalindrome("adda"));
    }
}
//    Учитывая строку, ваша задача состоит в том, чтобы переупорядочить свои буквы таким образом,
//    чтобы она стала палиндром (то есть она читает те же форварды и назад).
//        Вход
//        Единственная входная линия имеет цепь длины n, состоящую из символов a - z.
//        Выход
//        Распечатайте палиндром, состоящий из символов оригинальной строки.
//        Вы можете распечатать любое действительное решение. Если нет решений, распечатайте «Нет решения».
//        Ограничения
//
//        1 <= n <= 10^6
//
//        Пример
//        Вход:
//        AAAACACBA
//
//        Выход:
//        AACABACAA
