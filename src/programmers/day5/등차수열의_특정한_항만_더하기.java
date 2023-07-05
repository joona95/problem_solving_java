package programmers.day5;

public class 등차수열의_특정한_항만_더하기 {
    static public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num = a;
        for (boolean b : included) {
            if (b) {
                answer += num;
            }
            num += d;
        }
        return answer;
    }

    public static void main(String[] args) {
        boolean[] included1 = {true, false, false, true, true};
        System.out.println(solution(3, 4, included1));
        boolean[] included2 = {false, false, false, true, false, false, false};
        System.out.println(solution(7, 1, included2));
    }
}
