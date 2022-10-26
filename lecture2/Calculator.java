package lecture2;

public class Calculator {
    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }
    public void subst(int a, int b) {
        int number = a - b;
        System.out.println("Substraction is " + number);
    }
    public void multiply(int a, int b) {
        int number = a * b;
        System.out.println("Multiplication is " + number);
    }
    public void division(double a, double b) {
        double number = a / b;
        System.out.println("Division is " + number);
    }
}
