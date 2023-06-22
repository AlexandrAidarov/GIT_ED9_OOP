package HomeWorckOOP_07.Display;

import HomeWorckOOP_07.Calculator.Calculable;
import HomeWorckOOP_07.ComplexNumber;
import HomeWorckOOP_07.Calculator.InterfaceCalculableFactory;

import java.util.Scanner;

public class Display {
    private final Scanner scanner = new Scanner(System.in);

    private final InterfaceCalculableFactory InterfaceCalculableFactory;

    public Display(InterfaceCalculableFactory InterfaceCalculableFactory) {
        this.InterfaceCalculableFactory = InterfaceCalculableFactory;
    }

    public void run() {
        System.out.println("Калькулятор Комплексных чисел.");
        Calculable calculable = InterfaceCalculableFactory.create(getArgument());
        while (true) {
            System.out.print("Операция ( + , * , = ) : ");
            String input = scanner.nextLine().toLowerCase();
            switch (input) {
                case "+":
                calculable.sum(getArgument());
                    break;
                case "*":
                calculable.multiply(getArgument());
                    break;
                case "=":
                    System.out.println("Результат: " + calculable.result());
                    System.out.print("Продолжить y/n: ");
                    String nextCircle = scanner.nextLine().toLowerCase();
                    if (nextCircle.equals("n")) {
                        return;
                    } else {
                        calculable = InterfaceCalculableFactory.create(getArgument());
                    }
                    break;
                default:
                    System.out.println(input + " - операция не возможна");
            }
        }
    }

    private ComplexNumber getArgument() {
        System.out.print("Введите комплексное число: ");
        String input = scanner.nextLine();
        while (!input.matches("^[\\d]+\\+[\\d]+[i]$")) {
            System.out.print(input + " - не подходит, введите комплексное число: ");
            input = scanner.nextLine();
        }
        String[] arrayStr = input.split("\\+");
        String a = arrayStr[0];
        String b = arrayStr[1].split("[i]")[0];
        return new ComplexNumber(Integer.parseInt(a), Integer.parseInt(b));
    }
}
