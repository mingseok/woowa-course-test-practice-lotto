package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class RandomAndWinning {

    public List<Integer> comparison(List<List<Integer>> randomLotto, List<Integer> winningNumber) {
        List<Integer> result = new ArrayList<>();

        for (List<Integer> lotto : randomLotto) {
            int count = 0;

            count = getCount(winningNumber, lotto, count);
            result.add(count);
        }
        return result;
    }

    private int getCount(List<Integer> winningNumber, List<Integer> lotto, int count) {
        for (Integer integer : lotto) {
            if (winningNumber.contains(integer)) {
                count++;
            }
        }
        return count;
    }
}
