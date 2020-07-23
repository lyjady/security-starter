package org.augutus.demo.handler;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author LinYongJin
 * @date 2020/7/23 21:13
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleValidException(MethodArgumentNotValidException e) {
        e.printStackTrace();
        BindingResult result = e.getBindingResult();
        result.getFieldErrors().forEach(error -> System.out.println(error.getField() + ": " + error.getDefaultMessage()));
        return "fail";
    }
}
