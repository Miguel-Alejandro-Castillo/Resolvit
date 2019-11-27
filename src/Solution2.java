import java.util.*;

public class Solution2 {

    public int[] solution(int N) {
        Set<Integer> uniques = new HashSet<>();
        if(N > 0) {
            Random random = new Random();
            while (uniques.size() < N - 1) {
                int number = random.nextInt();
                uniques.add(number);
            }
            int resto = uniques.stream().reduce(0, Integer::sum) * -1;
            uniques.add(resto);
        }

        return uniques.stream().mapToInt(Integer::intValue).toArray();
    }
}
