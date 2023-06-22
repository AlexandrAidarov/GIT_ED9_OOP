package HomeWorckOOP_07.Logger;

import HomeWorckOOP_07.Calculator.Calculable;
import HomeWorckOOP_07.Calculator.InterfaceCalculableFactory;
import HomeWorckOOP_07.ComplexNumber;

public class LogCalculableFactory implements InterfaceCalculableFactory {

    Logger logger;

    public LogCalculableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(ComplexNumber arg) {
        return new LoggerCalculator(arg, logger);
    }
}
