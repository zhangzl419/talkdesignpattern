package com.learning.dp1.simplefactory;

public class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        double result = 0.0;

        if (Math.abs(getNumberB()) < 1e-6) {
            throw new Exception("除数不能为0。");
        } else {
            result = getNumberA() / getNumberB();
        }

        return result;
    }
}
