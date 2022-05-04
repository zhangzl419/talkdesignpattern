package com.learning.dp1.simplefactory;

public class Client {
    public static void main(String[] args) throws Exception {
        Operation operation;
        operation = OperationFactory.createOperation("+");
        operation.setNumberA(1.0);
        operation.setNumberB(2.0);
        System.out.println("result = " + operation.getResult());
    }
}
