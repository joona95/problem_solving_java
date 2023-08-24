package programmers.해시;

import java.util.*;

public class 베스트앨범 {
    public static int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genresMap = new HashMap<>();
        Map<String, List<Integer>> playsMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genresMap.put(genres[i], genresMap.getOrDefault(genres[i], 0) + plays[i]);
            List<Integer> playsList = playsMap.getOrDefault(genres[i], new ArrayList<>());
            playsList.add(i);
            playsMap.put(genres[i], playsList);
        }

        List<Integer> answer = new ArrayList<>();
        List<String> keySet = new ArrayList<>(genresMap.keySet());
        keySet.sort((o1, o2) -> genresMap.get(o2).compareTo(genresMap.get(o1)));
        for (String genre : keySet) {
            List<Integer> playList = playsMap.get(genre);
            playList.sort((o1, o2) -> Integer.compare(plays[o2], plays[o1]));
            for (int i = 0; i < Math.min(playList.size(), 2); i++) {
                answer.add(playList.get(i));
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})));
        System.out.println(Arrays.toString(solution(new String[]{"classic", "pop", "kpop", "classic", "classic", "pop"}, new int[]{500, 600, 5000, 150, 800, 2500})));
    }
}
