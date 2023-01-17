package Map_Set;

import java.util.HashMap;
import java.util.Scanner;

public class Problemt_1_학급_회장_해쉬 {
    static char solution(int n, String str) {
        char answer=' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char key : str.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        System.out.println(solution(n, str));
    }
}
