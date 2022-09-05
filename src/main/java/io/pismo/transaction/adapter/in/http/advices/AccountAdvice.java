package io.pismo.transaction.adapter.in.http.advices;

import io.pismo.transaction.adapter.in.http.advices.data.ErrorHandler;
import io.pismo.transaction.domain.exceptions.BadRequestException;
import io.pismo.transaction.domain.exceptions.InternalServerException;
import io.pismo.transaction.domain.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AccountAdvice {

  @ExceptionHandler(InternalServerException.class)
  public ResponseEntity<ErrorHandler> internalServerException(InternalServerException internalServerException) {
    ErrorHandler errorHandler = new ErrorHandler(HttpStatus.INTERNAL_SERVER_ERROR.value(), internalServerException.getMessage());
    return new ResponseEntity<>(errorHandler, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(BadRequestException.class)
  public ResponseEntity<ErrorHandler> badRequestException(BadRequestException badRequestException) {
    ErrorHandler errorHandler = new ErrorHandler(HttpStatus.BAD_REQUEST.value(), badRequestException.getMessage());
    return new ResponseEntity<>(errorHandler, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(NotFoundException.class)
  public ResponseEntity<ErrorHandler> notFoundException(NotFoundException notFoundException) {
    ErrorHandler errorHandler = new ErrorHandler(HttpStatus.NOT_FOUND.value(), notFoundException.getMessage());
    return new ResponseEntity<>(errorHandler, HttpStatus.NOT_FOUND);
  }

}
