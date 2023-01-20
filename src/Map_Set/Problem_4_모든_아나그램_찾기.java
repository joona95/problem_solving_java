package Map_Set;

import java.util.HashMap;
import java.util.Scanner;

public class Problem_4_모든_아나그램_찾기 {
    static int solution(String s, String t) {
        int answer = 0;
        /*
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length() - 1; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) - 1);
            if (map.get(s.charAt(i)) == 0)
                map.remove(s.charAt(i));
        }
        int lt = 0;
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            map.put(s.charAt(rt), map.getOrDefault(s.charAt(rt), 0) - 1);
            if (map.get(s.charAt(rt)) == 0)
                map.remove(s.charAt(rt));
            if (map.size() == 0)
                answer++;
            map.put(s.charAt(lt), map.getOrDefault(s.charAt(lt), 0) + 1);
            if (map.get(s.charAt(lt)) == 0)
                map.remove(s.charAt(lt));
            lt++;
        }
         */
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        for (char c : t.toCharArray())
            bm.put(c, bm.getOrDefault(c, 0) + 1);
        int len = t.length() - 1;
        for (int i = 0; i < len; i++)
            am.put(s.charAt(i), am.getOrDefault(s.charAt(i), 0) + 1);
        int lt = 0;
        for (int rt = len; rt < s.length(); rt++) {
            am.put(s.charAt(rt), am.getOrDefault(s.charAt(rt), 0) + 1);
            if (am.equals(bm))
                answer++;
            am.put(s.charAt(lt), am.get(s.charAt(lt)) - 1);
            if (am.get(s.charAt(lt)) == 0)
                am.remove(s.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(solution(s, t));
    }
}
