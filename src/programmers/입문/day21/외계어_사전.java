package programmers.입문.day21;

public class 외계어_사전 {
    public static int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            boolean flag = true;
            for (String s : spell) {
                if (!word.contains(s)) {
                    flag = false;
                }
            }
            if (flag)
                return 1;
        }
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }
}
