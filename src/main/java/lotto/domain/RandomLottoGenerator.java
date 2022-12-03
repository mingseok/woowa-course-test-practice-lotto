package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomLottoGenerator {
    public List<List<Integer>> randomNumber(int money) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < money; i++) {
            List<Integer> randomLotto = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            result.add(randomLotto);
        }
        return result;
    }
}