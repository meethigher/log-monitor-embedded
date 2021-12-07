package top.meethigher.logmonitorembedded.exception;


import top.meethigher.logmonitorembedded.constant.ResponseEnum;

/**
 * @author chenchuancheng
 * @since 2021/12/8 0:20
 */
public class CustomDescException extends Exception {
    private ResponseEnum responseEnum;

    private String desc;

    public CustomDescException() {
    }

    public CustomDescException(ResponseEnum responseEnum, String desc) {
        this.responseEnum = responseEnum;
        this.desc = desc;
    }


    public ResponseEnum getResponseEnum() {
        return responseEnum;
    }

    public void setResponseEnum(ResponseEnum responseEnum) {
        this.responseEnum = responseEnum;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

