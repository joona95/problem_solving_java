package programmers.기초.day23;

import java.util.Arrays;

public class 날짜_비교하기 {
    public static int solution(int[] date1, int[] date2) {
        /*
        if(date1[0] < date2[0])
            return 1;
        if(date1[0] == date2[0]) {
            if (date1[1] < date2[1])
                return 1;
            if (date1[1] == date2[1]) {
                if (date1[2] < date2[2])
                    return 1;
            }
        }
        return 0;
         */
        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29}));
        System.out.println(solution(new int[]{1024, 10, 24}, new int[]{1024, 10, 24}));
    }
}
