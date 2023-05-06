package com.jnsoft.dockerizedspringbootapp.exception;

import com.jnsoft.dockerizedspringbootapp.dto.ResponseBasicDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class GreetingExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> handleBlankFieldException(ConstraintViolationException ex, WebRequest request) {
        ResponseBasicDto responseBasicDto = new ResponseBasicDto();
        responseBasicDto.setStatus(HttpStatus.BAD_REQUEST);
        responseBasicDto.setMessage(ex.getMessage());
        return new ResponseEntity<>(responseBasicDto, responseBasicDto.getStatus());
    }
}
