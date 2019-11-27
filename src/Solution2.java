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

        Object []integers =  uniques.toArray();
        int []result = new int[integers.length];
        for(int i = 0; i < integers.length; i++) {
            result[i] = (int)integers[i];
        }

        return result;
    }
}
