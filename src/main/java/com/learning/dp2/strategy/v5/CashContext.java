package com.learning.dp2.strategy.v5;

import com.learning.dp2.strategy.v3.CashNormal;
import com.learning.dp2.strategy.v3.CashRebate;
import com.learning.dp2.strategy.v3.CashReturn;
import com.learning.dp2.strategy.v3.CashSuper;

public class CashContext {
    private CashSuper cs;

    public CashContext(int typeSelected) {
        switch (typeSelected) {
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
    }

    public double getResult(double money) {
        return this.cs.acceptCash(money);
    }


}