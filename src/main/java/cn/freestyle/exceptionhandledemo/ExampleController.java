package cn.freestyle.exceptionhandledemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExampleController {

    @ResponseBody
    @GetMapping("/test/01")
    public Response businessHandler(@RequestParam String param) {
        if (param.equals("e")) {
            throw new BusinessLogicException(4001,"参数错误");
        }
        return Response.success();
    }


    @ExceptionHandler(BusinessLogicException.class)
    @ResponseBody
    public Response businessExceptionHandler(BusinessLogicException e) {
        return Response.fail(e.getCode(),e.getMessage());
    }
}
