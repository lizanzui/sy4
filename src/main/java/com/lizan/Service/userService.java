package com.lizan.Service;

import com.lizan.Entity.UserEntity;
import org.springframework.stereotype.Service;

/**
 * @ClassName: userService
 * @Description: TODO
 * @author: 李赞
 * @date: 2020/12/7  6:55
 */
@Service
public interface userService {
    public UserEntity finduser(String name, String password);
}
