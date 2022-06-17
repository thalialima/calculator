package br.com.mcv.calculadora.model;

import br.com.mcv.calculadora.dto.RequestCalcDTO;

public class Calculator {
    public static double calculate(RequestCalcDTO request) {
        switch (request.getOperator()) {
            case '+':
                return request.getFirstValue() + request.getSecondValue();
            case '-':
                return request.getFirstValue() - request.getSecondValue();
            case '*':
                return request.getFirstValue() * request.getSecondValue();
            case '/':
                return request.getFirstValue() / request.getSecondValue();
            default:
                return 0;
        }
    }
}
