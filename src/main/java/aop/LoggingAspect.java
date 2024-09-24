package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    // Create a logger for the aspect
    private static final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    // Before the method execution
    @Before("execution(* Calculator.*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {

        // Log method start
        logger.info("Starting method " + joinPoint.getSignature().getName() + " with parameters " + java.util.Arrays.toString(joinPoint.getArgs()));
    }

    // After the method execution

    @After("execution(* Calculator.*(..))")
    public void logAfterMethod(JoinPoint joinPoint) {

        // Log method end
        logger.info("Finished method " + joinPoint.getSignature().getName());
    }
}