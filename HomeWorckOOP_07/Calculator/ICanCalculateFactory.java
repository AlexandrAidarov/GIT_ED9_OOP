package HomeWorckOOP_07.Calculator;

import model.ComplexNumber;

public interface ICanCalculateFactory {
    CanCalculate create(ComplexNumber arg);
}
