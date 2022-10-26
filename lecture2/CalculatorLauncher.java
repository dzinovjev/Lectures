package lecture2;

public class CalculatorLauncher {
    public static void main(String[] args) {
        int a = 13;
        int b = 7;
        Calculator calculator = new Calculator();
        calculator.sum(a, b);
        calculator.subst(a, b);
        calculator.multiply(b, a);
        calculator.division(a, b);
    }
}