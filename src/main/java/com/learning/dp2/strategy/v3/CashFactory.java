package com.learning.dp2.strategy.v3;

import java.util.ArrayList;
import java.util.List;

public class CashFactory {
    public static List<String> types = new ArrayList<>();
    static {
        types.add("正常收费");
        types.add("满300返100");
        types.add("打8折");
    }

    public static CashSuper createCashAccept(int typeIndex) {
        CashSuper cs = null;

        switch (typeIndex) {
            case 0:
                cs = new CashNormal();
                break;
            case 1:
                cs = new CashReturn("300", "100");
                break;
            case 2:
                cs = new CashRebate("0.8");
                break;
        }

        return cs;
    }
}
