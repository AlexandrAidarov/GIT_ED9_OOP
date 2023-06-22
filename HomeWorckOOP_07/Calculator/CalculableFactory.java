package HomeWorckOOP_07.Calculator;

import HomeWorckOOP_07.ComplexNumber;

public class CalculableFactory implements InterfaceCalculableFactory {
    public Calculable create(ComplexNumber arg) {
        return new Calculator(arg);
    }

}
