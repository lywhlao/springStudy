package YQFund;

/**
 * "返回值"
 * Created by hzlaojiaqi on 2016/8/19.
 */
public class ResponseEntity<T> {
    private int code;
    private String errorCode;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
