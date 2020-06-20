package Autre;

import java.io.Serializable;

public class MsgTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String msg;
    private int status;
    private String response;

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getResponse() {
        return response;
    }
    public void setResponse(String response) {
        this.response = response;
    }
}
