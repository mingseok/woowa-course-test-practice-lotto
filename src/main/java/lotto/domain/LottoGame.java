package lotto.domain;

import java.util.List;

public class LottoGame {

    private final List<List<Integer>> randomLotto;
    private final List<Integer> winningNumber;
    private final int bonusNumber;

    public LottoGame(List<List<Integer>> randomLotto, List<Integer> winningNumber, int bonusNumber) {
        this.randomLotto = randomLotto;
        this.winningNumber = winningNumber;
        this.bonusNumber = bonusNumber;
    }

    public List<Integer> correctNumber() {
        RandomAndWinning randomAndWinning = new RandomAndWinning();
        List<Integer> correctNumber = randomAndWinning.comparison(randomLotto, winningNumber);
        return correctNumber;
    }



}


