package cn.freestyle.exceptionhandledemo;

import lombok.Getter;

@Getter
public class Response<T> {

    private int code;
    private String msg;
    private T data;

    public Response(T data) {
        this.code = 200;
        this.msg = "操作成功";
        this.data = data;
    }

    public Response(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Response success() {
        return new Response(null);
    }

    public static Response fail(int code, String msg) {
        return new Response(code, msg);
    }
}
