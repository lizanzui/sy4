package com.lizan.Service.ServiceImpl;

import com.lizan.Dao.userDao;
import com.lizan.Entity.UserEntity;
import com.lizan.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: userServiceImpl
 * @Description: TODO
 * @author: 李赞
 * @date: 2020/12/7  6:57
 */
@Service
public class userServiceImpl implements userService {
    @Autowired
    private userDao userDao;
    @Override
    public UserEntity finduser(String name, String password) {
        UserEntity user = userDao.findByLoginNameAndPassword(name, password);
        return user;
    }
}
