package de.neuefische.springexceptionhandlingtask.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //with 'exception.printStackTrace()'
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage handleIllegalArgumentException(IllegalArgumentException exception){
        exception.printStackTrace();
        return new ErrorMessage(exception.getMessage());
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ErrorMessage handelNoSuchElementException(NoSuchElementException exception){
        exception.printStackTrace();
        return new ErrorMessage(exception.getMessage());
    }

/*    @ExceptionHandler(Exception.class)
    public ErrorMessage handelException(Exception exception){
        exception.printStackTrace();
        return new ErrorMessage(exception.getMessage());
    }*/




}
