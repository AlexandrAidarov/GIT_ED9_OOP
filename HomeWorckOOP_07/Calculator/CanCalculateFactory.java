package HomeWorckOOP_07.Calculator;

import model.ComplexNumber;

public class CanCalculateFactory implements ICanCalculateFactory {
    public CanCalculate create(ComplexNumber arg) {
        return new Calculator(arg);
    }

}
