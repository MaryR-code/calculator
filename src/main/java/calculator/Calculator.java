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
        double result = 0;

        switch (op_1) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                return "error";
        }

        if (expr.length == 5) {

            String op_2 = expr[3];
            double c = Double.parseDouble(expr[4]);

            switch (op_2) {
                case "+":
                    result = result + c;
                    break;
                case "-":
                    result = result - c;
                    break;
                case "/":
                    result = result / c;
                    break;
                case "*":
                    result = result * c;
                    break;
                default:
                    return "error";
            }
        }

        return String.valueOf(result);
    }

}
