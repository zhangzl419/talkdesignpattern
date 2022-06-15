package com.learning.dp2.strategy.v4;

import com.learning.dp2.strategy.v3.CashSuper;

public class CashContext {
    private CashSuper cs;

    public CashContext(CashSuper cs) {
        this.cs = cs;
    }

    public double getResult(double money) {
        return this.cs.acceptCash(money);
    }


}
