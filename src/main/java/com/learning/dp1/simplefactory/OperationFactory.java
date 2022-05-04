package com.learning.dp1.simplefactory;

public class OperationFactory {
    public static Operation createOperation(String operationStr) {
        Operation operation = null;

        switch (operationStr) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }

        return operation;
    }
}
