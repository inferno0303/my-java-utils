package com.inferno0303;

import java.util.HashMap;

public class RestfulResponse {

    private static final String statusCode200 = "请求成功";
    private static final String statusCode403 = "权限失效";
    private static final String statusCode500 = "请求参数错误";
    private static final String loginSuccess = "登录成功";
    private static final String loginFail = "登录成功";
    private static final String logout = "注销登录";

    public static String response200(Object data) {
        HashMap<String, Object> json = new HashMap<>(3);
        json.put("code", 200);
        json.put("message", statusCode200);
        json.put("data", data);
        return json.toString();
    }

    public static String response403(Object data) {
        HashMap<String, Object> json = new HashMap<>(3);
        json.put("code", 403);
        json.put("message", statusCode403);
        json.put("data", data);
        return json.toString();
    }

    public static String response500(Object data) {
        HashMap<String, Object> json = new HashMap<>(3);
        json.put("code", 200);
        json.put("message", statusCode500);
        json.put("data", data);
        return json.toString();
    }

    public static String response(Integer code, String message, Object data) {
        HashMap<String, Object> json = new HashMap<>(3);
        json.put("code", code);
        json.put("message", message);
        json.put("data", data);
        return json.toString();
    }

    public static void main(String[] args) {
	// write your code here
    }
}
