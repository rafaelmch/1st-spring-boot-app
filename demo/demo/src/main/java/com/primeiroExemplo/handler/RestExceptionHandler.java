package com.primeiroExemplo.handler;

// manipulador de exceções REST

// um controlador dentro da nossa aplicação
import com.primeiroExemplo.model.error.ErrorMessage;
import com.primeiroExemplo.model.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResouceNotFoundException(ResourceNotFoundException ex){
        ErrorMessage error = new ErrorMessage("Not found", HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
