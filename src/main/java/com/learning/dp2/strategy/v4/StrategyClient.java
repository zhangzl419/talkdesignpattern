package com.learning.dp2.strategy.v4;

import com.learning.dp2.strategy.v3.CashFactory;
import com.learning.dp2.strategy.v3.CashNormal;
import com.learning.dp2.strategy.v3.CashRebate;
import com.learning.dp2.strategy.v3.CashReturn;

public class StrategyClient {
    public static void main(String[] args) {
        CashContext cc = null;

        int typeSelected = 0;
        switch (typeSelected) {
            case 0:
                cc = new CashContext(new CashNormal());
                break;
            case 1:
                cc = new CashContext(new CashReturn("300", "100"));
                break;
            case 2:
                cc = new CashContext(new CashRebate("0.8"));
                break;
        }

        double totalPayment = 0.0;
        double price = 0.0;
        double num = 1.0;
        totalPayment = cc.getResult(price * num);

        System.out.println("单价: " + price + " 数量: " + num + " 折扣: " + CashFactory.types.get(typeSelected) + " 合计：" + totalPayment);

    }
}
