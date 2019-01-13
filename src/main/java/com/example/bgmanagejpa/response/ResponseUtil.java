package com.example.bgmanagejpa.response;

public class ResponseUtil {

    private enum MyEnumSingleton{
        INSTANCE;
        private Response response;
         MyEnumSingleton(){
            response = new Response();
        }
        public Response getResource(){
            return response;
        }
    }

    /**
     * 成功
     * @param data
     * @return
     */
    public static Response SUCCESS(Object data){
        Response response = MyEnumSingleton.INSTANCE.getResource();
        response.setCode(1001);
        response.setMsg("成功");
        response.setData(data);
        return response;
    }

    /**
     * 失败
     * @param msg
     * @return
     */
    public static Response FAIL(String msg){
        Response response = MyEnumSingleton.INSTANCE.getResource();
        response.setCode(1002);
        response.setMsg(msg);
        return response;
    }

    /**
     * 异常
     * @param msg
     * @return
     */
    public static Response ERR(String msg){
        Response response = MyEnumSingleton.INSTANCE.getResource();
        response.setCode(1003);
        response.setMsg(msg);
        return response;
    }

    /**
     * 登录过期
     * @param msg
     * @return
     */
    public static Response LOGIN_EXPIRE(String msg){
        Response response = MyEnumSingleton.INSTANCE.getResource();
        response.setCode(1004);
        response.setMsg(msg);
        return response;
    }

}
