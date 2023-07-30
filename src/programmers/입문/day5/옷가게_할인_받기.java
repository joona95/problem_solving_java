package programmers.입문.day5;

public class 옷가게_할인_받기 {
    public static int solution(int price) {
        int discount = price >= 500000 ? 20 : price >= 300000 ? 10 : price >= 100000 ? 5 : 0;
        return price * (100 - discount) / 100;
        /*
        if (price >= 500000)
            return price * 0.8;
        if (price >= 300000)
            return price * 0.9;
        if (price >= 100000)
            return price * 0.95;
        return price;
         */
    }

    public static void main(String[] args) {
        System.out.println(solution(150000));
        System.out.println(solution(580000));
    }
}
