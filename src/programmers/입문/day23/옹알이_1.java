package programmers.입문.day23;

public class 옹알이_1 {
    public static int solution(String[] babbling) {
        int answer = 0;
        for (String b : babbling) {
            b = b.replace("aya", " ");
            b = b.replace("ye", " ");
            b = b.replace("woo", " ");
            b = b.replace("ma", " ");
            b = b.replace(" ", "");
            if (b.isEmpty())
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }
}
