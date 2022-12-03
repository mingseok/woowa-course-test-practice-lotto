package lotto;

import lotto.controller.LottoController;
import lotto.domain.LottoGameGenerator;
import lotto.domain.RandomLottoGenerator;
import lotto.view.LottoGameInput;
import lotto.view.LottoGameOutput;

public class Application {
    public static void main(String[] args) {
        //TODO: 검증부분 넣어서 보내기 위해
        LottoGameInput lottoGameInput = new LottoGameInput();
        LottoGameOutput lottoGameOutput = new LottoGameOutput();

        //TODO: 인풋 두개 사용
        LottoGameGenerator lottoGameGenerator = new LottoGameGenerator(new RandomLottoGenerator(), lottoGameInput);

        LottoController lottoController = new LottoController(lottoGameInput, lottoGameOutput, lottoGameGenerator);
        lottoController.run();
    }
}
