package com.http;

public class testmain {

	public static void main(String[] args) {
        //发送 GET 请求http://120.132.55.5/android/login?username=admin&password=admin&pid=0000000000000000000
        String s=HttpRequest.sendGet("http://120.132.55.5/android/login", "username=admin&password=admin&pid=0000000000000000000");
        System.out.println(s);
        
        //发送 POST 请求
//        String sr=HttpRequest.sendPost("http://localhost:6144/Home/RequestPostString", "key=123&v=456");
//        System.out.println(sr);
    }

}
