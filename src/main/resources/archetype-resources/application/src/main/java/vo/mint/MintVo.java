package ${package}.vo.mint;

import lombok.Data;

/**
 * @Author: baozi
 * @Date: 2019/6/27 10:45
 * @Description:
 */
@Data
public class MintVo {
    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickName;
}
