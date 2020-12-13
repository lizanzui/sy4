package com.lizan.Dao;

import com.lizan.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: userDao
 * @Description: TODO
 * @author: 李赞
 * @date: 2020/12/7  7:01
 */
public interface userDao extends JpaRepository<UserEntity,Integer> {
    public UserEntity findByLoginNameAndPassword(String name,String password);
}
