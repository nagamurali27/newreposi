package com.onesoft.firstproject.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
@ExceptionHandler(NoSuchElementException.class)
public ResponseEntity<Object> inbuilthandling(NoSuchElementException ne) {
	return new ResponseEntity<>(ne.getMessage(), HttpStatus.NOT_FOUND);
}

@ExceptionHandler(ColorException.class)
public ResponseEntity<Object> colofullexception(ColorException ce) {
	return new ResponseEntity<Object>(ce.getMessage(), HttpStatus.NOT_FOUND);
}
}
