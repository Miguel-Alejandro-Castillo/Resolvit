import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {

    public int solution(int[] A){
        List<Integer> L  = Arrays.stream( A ).boxed().collect( Collectors.toList() );
        return L.stream().filter(num -> num > -10 && num < 10).max(Integer::compare).get();
    }
}