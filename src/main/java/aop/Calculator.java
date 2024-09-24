package aop;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return  a - b;
    }

    public int multiply(int a, int b){
        return  a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(20, 10);
        calculator.subtract(20, 10);
        calculator.multiply(2, 3);
        calculator.divide(20, 10);
    }
}
