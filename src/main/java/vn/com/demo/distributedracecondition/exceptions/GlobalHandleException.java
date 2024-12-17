package vn.com.demo.distributedracecondition.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandleException {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAbstractException(Exception e) {
        return ResponseEntity.internalServerError()
                .body(e.getMessage());
    }
}
