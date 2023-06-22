package HomeWorckOOP_07.Logger;


import HomeWorckOOP_07.Calculator.Calculator;
import HomeWorckOOP_07.Calculator.Calculable;

import HomeWorckOOP_07.ComplexNumber;

public class LoggerCalculator implements Calculable {

    Calculator calculator;
    Logger logger;

    public LoggerCalculator(ComplexNumber arg, Logger logger) {
        this.calculator = new Calculator(arg);
        this.logger = logger;
        logger.log("first argument - " + arg + '\n');
    }

    @Override
    public void sum(ComplexNumber number) {
        logger.log("sum " + number + '\n');
        calculator.sum(number);
    }

    @Override
    public void multiply(ComplexNumber number) {
        logger.log("multiply " + number + '\n');
        calculator.multiply(number);
    }

    @Override
    public ComplexNumber result() {
        ComplexNumber result = calculator.result();
        logger.log("Result - " + result + '\n');
        return result;
    }
}
