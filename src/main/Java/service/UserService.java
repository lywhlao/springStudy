package service;

import bean.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.UserDao;

/**
 * Created by hzlaojiaqi on 2016/8/17.
 */

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public UserEntity findUserById(int id) {

        UserEntity userEntity = userDao.findUserById(id);
        return userEntity;
    }


}
