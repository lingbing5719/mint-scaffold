package ${package}.service.atom;


import ${package}.service.dto.user.SearchUser;
import ${package}.service.dto.user.UserDto;

import java.util.List;

/**
 * @Auther: baozi
 * @Date: 2019/6/25 14:57
 * @Description:
 */
public interface UserService {
    /**
     * 创建user
     * @param userDto
     * @return
     */
    boolean createUser(UserDto userDto);

    /**
     * 搜索用户
     * @param searchUser
     * @return
     */
    List<UserDto> getUsers(SearchUser searchUser);
}