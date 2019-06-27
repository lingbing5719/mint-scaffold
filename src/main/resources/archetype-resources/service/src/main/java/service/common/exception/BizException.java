package ${package}.service.common.exception;

import ${package}.service.common.constant.ResultCode;
import lombok.Data;
import lombok.ToString;

/**
 * @Auther:
 * @Date: 2019/6/27 10:14
 * @Description:
 * 业务异常
 */
@Data
@ToString
public class BizException extends RuntimeException {
    private int status;
    private String msg;

    public BizException(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public BizException(ResultCode error) {
        this.status = error.getCode();
        this.msg = error.getMsg();
    }
}
