package programmers.해시;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 전화번호_목록 {
    public static boolean solution(String[] phone_book) {
        /*
        Arrays.sort(phone_book);
        for (int i = 1; i < phone_book.length; i++) {
            if (phone_book[i].startsWith(phone_book[i - 1]))
                return false;
        }
        return true;
         */
        Map<String, Integer> map = new HashMap<>();
        for (int i=0;i< phone_book.length;i++) {
            map.put(phone_book[i], i);
        }
        for (String s : phone_book) {
            for (int j = 0; j < s.length(); j++) {
                if (map.containsKey(s.substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(solution(new String[]{"123", "456", "789"}));
        System.out.println(solution(new String[]{"12", "123", "1235", "567", "88"}));
    }
}
