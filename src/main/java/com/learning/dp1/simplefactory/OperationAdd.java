package com.learning.dp1.simplefactory;

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() + getNumberB();

        return result;
    }
}
