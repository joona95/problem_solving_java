package Map_Set;

import java.util.HashMap;
import java.util.Scanner;

public class Problem_2_아나그램_해쉬 {
    static String solution(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        /*
        for(char c : str2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
            if(map.get(c) == 0)
                map.remove(c);
        }
        if(map.size() > 0)
            return "NO";
         */
        for(char c : str2.toCharArray()) {
            if(!map.containsKey(c) || map.get(c) == 0)
                return "NO";
            map.put(c, map.get(c) - 1);
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        System.out.println(solution(str1, str2));
    }
}
