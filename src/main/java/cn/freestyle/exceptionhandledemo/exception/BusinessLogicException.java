package cn.freestyle.exceptionhandledemo.exception;

import org.springframework.http.HttpStatus;

/**
 *
 * @author freestyle
 */
public class BusinessLogicException extends ResponseException{

    public BusinessLogicException(int code, String msg) {
        super(HttpStatus.OK,code, msg);

    }

}
