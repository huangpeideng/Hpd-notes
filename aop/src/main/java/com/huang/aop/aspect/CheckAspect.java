package com.huang.aop.aspect;
import com.huang.aop.annotation.CheckLoginUser;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class CheckAspect {

    @Pointcut("@annotation(com.huang.aop.annotation.CheckLoginUser)")
    public void check(){

    }

    @Around(value = "check() && @annotation(checkLoginUser)")
    public Object around(ProceedingJoinPoint joinPoint,CheckLoginUser checkLoginUser) throws Throwable {
        log.info("开始调用api{}",checkLoginUser.value());
        Object proceed = joinPoint.proceed();
        log.info("结束调用api{}",proceed);
        return proceed;
    }
}

