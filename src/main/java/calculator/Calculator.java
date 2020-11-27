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
        String op = op_1 + op_2;
        double result = 0;

        switch (op) {
            case "++":
                result = a + b + c;
                break;
            case "+-":
                result = a + b - c;
                break;
            case "+/":
                result = a + b / c;
                break;
            case "+*":
                result = a + b * c;
                break;
            case "-+":
                result = a - b + c;
                break;
            case "--":
                result = a - b - c;
                break;
            case "-/":
                result = a - b / c;
                break;
            case "-*":
                result = a - b * c;
                break;
            case "/+":
                result = a / b + c;
                break;
            case "/-":
                result = a / b - c;
                break;
            case "//":
                result = a / b / c;
                break;
            case "/*":
                result = a / b * c;
                break;
            case "*+":
                result = a * b + c;
                break;
            case "*-":
                result = a * b - c;
                break;
            case "*/":
                result = a * b / c;
                break;
            case "**":
                result = a * b * c;
                break;
            default:
                return "error";
            }

        return String.valueOf(result);
    }

}
