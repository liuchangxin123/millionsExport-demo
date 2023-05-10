package com.pluto.millionsExport.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;

/**
 * 简易切面
 *
 * @author: pluto
 * @date: 2023/5/10 17:15
 */
@Component
@Aspect
public class BaseAspect {

    private static final Log logger = LogFactory.getLog(BaseAspect.class);

    @Around("execution(public void com.pluto.millionsExport.controller.MillionController.exportExcel(..))")
    public void exportExcel(ProceedingJoinPoint joinPoint) {
        long startTime = System.nanoTime();
        logger.info("开始导出：" + joinPoint.getSignature().getName());
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } finally {
            Duration time = Duration.ofNanos(System.nanoTime() - startTime);
            logger.info("导出结束，消耗了：" + time.getSeconds() + "s");
        }

    }

    @Around("execution(public void com.pluto.millionsExport.controller.MillionController.importExcel(..))")
    public void importExcel(ProceedingJoinPoint joinPoint) {
        long startTime = System.nanoTime();
        logger.info("开始导入：" + joinPoint.getSignature().getName());
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } finally {
            Duration time = Duration.ofNanos(System.nanoTime() - startTime);
            logger.info("导入结束，消耗了：" + time.getSeconds() + "s");
        }

    }
}
