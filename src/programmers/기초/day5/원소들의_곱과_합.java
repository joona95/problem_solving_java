package programmers.기초.day5;

public class 원소들의_곱과_합 {
    static public int solution(int[] num_list) {
        int sum = 0;
        int multiply = 1;
        for (int num : num_list) {
            sum += num;
            multiply *= num;
        }
        return multiply < Math.pow(sum, 2) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] num_list1 = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list1));
        int[] num_list2 = {5, 7, 8, 3};
        System.out.println(solution(num_list2));
    }
}
