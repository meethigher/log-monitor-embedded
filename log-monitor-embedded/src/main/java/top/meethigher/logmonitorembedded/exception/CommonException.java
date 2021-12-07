package top.meethigher.logmonitorembedded.exception;


import top.meethigher.logmonitorembedded.constant.ResponseEnum;

/**
 * @author chenchuancheng
 * @since 2021/12/8 0:20
 */
public class CommonException extends Exception {
    private ResponseEnum responseEnum;

    public CommonException(ResponseEnum responseEnum) {
        this.responseEnum=responseEnum;
    }

    public CommonException(String message) {
        super(message);
    }

    public ResponseEnum getResponseEnum() {
        return responseEnum;
    }

    public void setResponseEnum(ResponseEnum responseEnum) {
        this.responseEnum = responseEnum;
    }
}
