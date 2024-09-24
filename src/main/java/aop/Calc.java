package aop;

import java.util.logging.Logger;

public class Calc {

    // Creating a logger class for calculator class
    private static final Logger logger = Logger.getLogger(Calc.class.getName());

    // Methods
    public int add(int a, int b){
        logger.info("Starting method add with parameters a = " + a + ", b = " + b);
        int result = a + b;
        logger.info("Finished method add(). Result = " + result);
        return result;
    }

    public int subtract(int a, int b){
        logger.info("Starting method subtract with parameters a = " + a + ", b = " + b);
        int result = a - b;
        logger.info("Finished method subtract(). Result = " + result);
        return  result;

    }

    public int multiply(int a, int b){
        logger.info("Starting method multiply with parameters a = " + a + ", b = " + b);
        int result = a * b;
        logger.info("Finished method multiply(). Result = " + result);
        return result;
    }

    public int divide(int a, int b){
        logger.info("Starting method divide with parameters a = " + a + ", b = " + b);
        int result = a / b;
        logger.info("Finished method divide(). Result = " + result);
        return result;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();

        // Performing some calculations
        calc.add(4, 3);
        calc.subtract(4, 3);
        calc.multiply(3, 2);
        calc.divide(20, 10);

    }
}
