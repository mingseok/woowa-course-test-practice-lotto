package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class LottoGameInput {
    private final int PRICE = 1000;

    public int amount() {
        String lottoAmount = Console.readLine();
        int moneyNumber = Integer.parseInt(lottoAmount);
        int verifiedMoney = sizeMoney(moneyNumber);
        return verifiedMoney;
    }

    public List<Integer> winning() {
        String lottoWinning = Console.readLine();

        List<Integer> result = new ArrayList<>();
        for (String winningNumber : lottoWinning.split(",")) {
            result.add(Integer.parseInt(winningNumber));
        }
        return result;
    }

    public int bonus() {
        String lottoBonus = Console.readLine();
        int bonusNumber = Integer.parseInt(lottoBonus);
        return bonusNumber;
    }

    //TODO: 예외처리 하기
    public int sizeMoney(int money) {
        return money / PRICE;
    }
}