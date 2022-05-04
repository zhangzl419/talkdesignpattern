package com.learning.dp1.simplefactory;

import lombok.Data;

@Data
public abstract class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public abstract double getResult() throws Exception;
}
