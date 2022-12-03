package lotto.controller;

import lotto.domain.LottoGame;
import lotto.domain.LottoGameGenerator;
import lotto.view.LottoGameInput;
import lotto.view.LottoGameOutput;

import java.util.List;

public class LottoController {
    private final LottoGameInput lottoGameInput;
    private final LottoGameOutput lottoGameOutput;
    private final LottoGameGenerator lottoGameGenerator;

    public LottoController(LottoGameInput lottoGameInput,
                           LottoGameOutput lottoGameOutput,
                           LottoGameGenerator lottoGameGenerator) {
        this.lottoGameInput = lottoGameInput;
        this.lottoGameOutput = lottoGameOutput;
        this.lottoGameGenerator = lottoGameGenerator;
    }

    public void run() {

        List<List<Integer>> randomLotto = lottoGameGenerator.getRandomLotto();
        List<Integer> winningNumber = lottoGameGenerator.getWinningNumber();
        int bonusNumber = lottoGameGenerator.getBonusNumber();

        LottoGame lottoGame = new LottoGame(randomLotto, winningNumber, bonusNumber);
        List<Integer> correctNumber = lottoGame.correctNumber();




    }
}
