public class Calculator
{
    public static void main(String[] args)
    {
        double number1 = 10;
        double number2 = 5;
        char operator = '+';
        performCalculation(number1, number2, operator);
    }

    public static void performCalculation(double num1, double num2, char operator)
    {
        double result;

        switch (operator)
        {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0)
                {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                else
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
