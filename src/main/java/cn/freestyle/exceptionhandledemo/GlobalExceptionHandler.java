package cn.freestyle.exceptionhandledemo;

import cn.freestyle.exceptionhandledemo.exception.ResponseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author freestyle
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResponseException.class)
    @ResponseBody
    public ResponseEntity<Response> businessExceptionHandler(ResponseException e) {
        Response body = Response.fail(e.getCode(), e.getMessage());
        return new ResponseEntity<>(body,e.getHttpStatus());
    }
}
