package com.learning.dp2.strategy.v3;

public class Client {
    public static void main(String[] args) {
        double totalPayment = 0.0;
        double price = 0.0;
        double num = 0.0;

        int typeSelected = 0;
        CashSuper cashSuper = CashFactory.createCashAccept(typeSelected);
        totalPayment = cashSuper.acceptCash(price * num);

        System.out.println("单价: " + price + " 数量: " + num + " 折扣: " + CashFactory.types.get(typeSelected) + " 合计：" + totalPayment);

    }
}


