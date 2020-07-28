package org.augutus.demo.handler;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author LinYongJin
 * @date 2020/7/23 21:13
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> handleValidException(MethodArgumentNotValidException e) {
        e.printStackTrace();
        Map<String, Object> errors = new HashMap<>();
        BindingResult bindingResult = e.getBindingResult();
        List<String> collect = bindingResult.getFieldErrors().stream().map(error -> "属性" + error.getField() + error.getDefaultMessage()).collect(Collectors.toList());
        errors.put("message", collect);
        errors.put("data", null);
        errors.put("code", 500);
        return errors;
    }
}
