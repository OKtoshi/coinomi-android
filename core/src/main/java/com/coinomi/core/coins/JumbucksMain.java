package com.coinomi.core.coins;

import org.bitcoinj.core.Coin;

/**
 * @author Julian Yap
 */
public class JumbucksMain extends CoinType {
    private JumbucksMain() {
        id = "jumbucks.main";

        addressHeader = 43;
        p2shHeader = 105;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 500;

        name = "Jumbucks";
        symbol = "JBS";
        uriScheme = "jumbucks";
        bip44Index = 26;
        unitExponent = 8;
        feePerKb = value(10000); // 0.0001 JBS
        minNonDust = value(1);
        softDustLimit = value(1000000); // 0.01 JBS
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
    }

    private static JumbucksMain instance = new JumbucksMain();
    public static synchronized JumbucksMain get() {
        return instance;
    }
}