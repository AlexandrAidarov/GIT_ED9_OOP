package HomeWorckOOP_07;


import HomeWorckOOP_07.Logger.FileLogger;
import HomeWorckOOP_07.Logger.LogCalculableFactory;
import HomeWorckOOP_07.Logger.Logger;
import HomeWorckOOP_07.Display.Display;

public class Main {
    public static void main(String[] args) {
        Logger logger = new FileLogger();
        LogCalculableFactory logCalculableFactory = new LogCalculableFactory(logger);
        Display display = new Display(logCalculableFactory);
        display.run();
    }
}
