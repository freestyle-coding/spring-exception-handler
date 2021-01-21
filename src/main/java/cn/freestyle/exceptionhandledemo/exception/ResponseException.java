package cn.freestyle.exceptionhandledemo.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 *
 * @author freestyle
 */
@Getter
public abstract class ResponseException extends RuntimeException {

    private HttpStatus httpStatus;
    private int code;

    public ResponseException(HttpStatus httpStatus ,int code, String msg) {
        super(msg);
        this.code = code;
        this.httpStatus = httpStatus;
    }

}
