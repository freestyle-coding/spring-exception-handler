package cn.freestyle.exceptionhandledemo.exception;

import org.springframework.http.HttpStatus;

public class DataConsistencyException extends ResponseException {

    public DataConsistencyException(String msg) {
        super(HttpStatus.INTERNAL_SERVER_ERROR,500, msg);
    }
}
