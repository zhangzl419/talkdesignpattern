package com.learning.dp2.strategy.v5;

import com.learning.dp2.strategy.v3.CashFactory;
import com.learning.dp2.strategy.v3.CashNormal;
import com.learning.dp2.strategy.v3.CashRebate;
import com.learning.dp2.strategy.v3.CashReturn;

public class StrategyClient5 {

    public static void main(String[] args) {


        int typeSelected = 0;
        CashContext cc = new CashContext(typeSelected);

        double totalPayment = 0.0;
        double price = 0.0;
        double num = 1.0;

        totalPayment = cc.getResult(price * num);

        System.out.println("单价: " + price + " 数量: " + num + " 折扣: " + CashFactory.types.get(typeSelected) + " 合计：" + totalPayment);

    }
}
