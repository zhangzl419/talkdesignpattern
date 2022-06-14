package com.learning.dp2.strategy.v2;

import java.util.*;

public class Cash {
    public static void main(String[] args) {
        List<String> rebates = new ArrayList<>();
        rebates.add("正常收费");
        rebates.add("打八折");
        rebates.add("打七折");
        rebates.add("打五折");

        double totalPayment = 0.0;
        double price = 0.0;
        double num = 0.0;

        int selectedIndex = 0;
        switch (selectedIndex) {
            case 0:
                totalPayment = price * num;
                break;
            case 1:
                totalPayment = price * num * 0.8;
                break;
            case 2:
                totalPayment = price * num * 0.7;
                break;
            case 3:
                totalPayment = price * num * 0.5;
                break;
        }

        System.out.println("单价: " + price + " 数量: " + num + " 折扣: " + rebates.get(selectedIndex) + " 合计：" + totalPayment);
    }
}
