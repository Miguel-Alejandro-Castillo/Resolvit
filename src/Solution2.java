import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Solution2 {

    public int[] solution(int N) {
        Set<Integer> uniques = new HashSet<Integer>();
        if(N > 0) {
            if(N == 1) {
                uniques.add(0);
            }
            else {
                Random random = new Random();
                while (uniques.size() < N - 1) {
                    int number = random.nextInt();
                    uniques.add(number);
                }
                int resto = uniques.stream().reduce(0, Integer::sum) * -1;
                uniques.add(resto);
            }
        }

        Integer []integers = (Integer[]) uniques.toArray();
        int []result = new int[integers.length];
        for(int i = 0; i < integers.length; i++) {
            result[i] = integers[i];
        }

        return result;
    }

}
