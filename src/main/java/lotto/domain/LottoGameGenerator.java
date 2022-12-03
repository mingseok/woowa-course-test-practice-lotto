package lotto.domain;

import lotto.view.LottoGameInput;

import java.util.List;

public class LottoGameGenerator {

    private final RandomLottoGenerator randomLottoGenerator;
    private final LottoGameInput lottoGameInput;

    public LottoGameGenerator(RandomLottoGenerator randomLottoGenerator,
                              LottoGameInput lottoGameInput) {
        this.randomLottoGenerator = randomLottoGenerator;
        this.lottoGameInput = lottoGameInput;
    }

    public List<List<Integer>> getRandomLotto() {
        int money = lottoGameInput.amount();
        List<List<Integer>> randomNumber = randomLottoGenerator.randomNumber(money);
        return randomNumber;
    }

    public List<Integer> getWinningNumber() {
        return lottoGameInput.winning();
    }

    public int getBonusNumber() {
        return lottoGameInput.bonus();
    }
}
