package dragonsandflagons.core.character.items.coinage;

import java.util.HashMap;
import java.util.Map;

public class Wallet {

    private Map<Coinage, Integer> coinageCount;
    private double totalMoney;

    public Wallet() {
        coinageCount = new HashMap<>();
        totalMoney = 0;
        coinageCount.put(Coinage.GOLD, 0);
        coinageCount.put(Coinage.COPPER, 0);
        coinageCount.put(Coinage.ELECTRUM, 0);
        coinageCount.put(Coinage.SILVER, 0);
        coinageCount.put(Coinage.PLATINUM, 0);
    }

    public int getCoinCount(Coinage coinage) {
        return coinageCount.get(coinage);
    }

    public void depositCoin(Coinage coinage, int amount){
        int currentCoins = coinageCount.get(coinage);
        coinageCount.put(coinage, currentCoins + amount);
    }

    public void spendCoin(Coinage coinage, int amount){
        
    }

}
