package cn.freestyle.exceptionhandledemo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author freestyle
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessLogicException.class)
    @ResponseBody
    public Response businessExceptionHandler(BusinessLogicException e) {
        return Response.fail(e.getCode(),e.getMessage());
    }
}
