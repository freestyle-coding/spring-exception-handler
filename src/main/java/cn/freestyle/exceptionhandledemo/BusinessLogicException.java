package cn.freestyle.exceptionhandledemo;

/**
 *
 * @author freestyle
 */
public class BusinessLogicException extends RuntimeException{

    private int code;

    public BusinessLogicException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public int getCode() {
        return  code;
    }


}
