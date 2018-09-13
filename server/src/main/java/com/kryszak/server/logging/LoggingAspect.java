package com.kryszak.server.logging;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* *(..)) && @annotation(LogCall)")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        String methodName = point.getSignature().getName();

        Object[] args = point.getArgs();
        String entryLog = ">> {} called.";
        if (args.length > 0) {
            entryLog += " Parameters: {}";
        }
        log.info(entryLog, methodName, args);

        Object result = point.proceed();

        String exitLog = "<< {} finished.";
        if (result != null) {
            exitLog += " Result: {}";
        }

        Object retLogged = result instanceof Collection<?> ? "size=" + ((Collection) result).size() : result;

        log.info(exitLog, methodName, retLogged);

        return result;
    }
}
