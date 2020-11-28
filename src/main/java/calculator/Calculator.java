package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expr) {
        double a = Double.parseDouble(expr[0]);
        String op_1 = expr[1];
        double b = Double.parseDouble(expr[2]);
        String op_2 = expr[3];
        double c = Double.parseDouble(expr[4]);
        double d = 0;
        double result = 0;

        switch (op_1) {
            case "+":
                d = a + b;
                break;
            case "-":
                d = a - b;
                break;
            case "/":
                d = a / b;
                break;
            case "*":
                d = a * b;
                break;
            default:
                return "error";
        }

        switch (op_2) {
            case "+":
                result = d + c;
                break;
            case "-":
                result = d - c;
                break;
            case "/":
                result = d / c;
                break;
            case "*":
                result = d * c;
                break;
            default:
                return "error";
        }

        return String.valueOf(result);
    }

}
