package cn.freestyle.exceptionhandledemo;

import cn.freestyle.exceptionhandledemo.exception.BusinessLogicException;
import cn.freestyle.exceptionhandledemo.exception.DataConsistencyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author freestyle
 */
@Controller
public class ExampleController {

    @ResponseBody
    @GetMapping("/test/01")
    public Response test1Handler(@RequestParam String param) {
        if (param.equals("e")) {
            throw new BusinessLogicException(4001,"参数错误");
        }
        return Response.success();
    }

    @ResponseBody
    @GetMapping("/test/02")
    public Response test2Handler(@RequestParam String param) {
        if (param.equals("e")) {
            throw new DataConsistencyException("数据库数据异常");
        }
        return Response.success();
    }





    @ExceptionHandler(BusinessLogicException.class)
    @ResponseBody
    public Response businessExceptionHandler(BusinessLogicException e) {
        return Response.fail(e.getCode(),e.getMessage());
    }
}
