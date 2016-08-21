package YQFund.service;

import YQFund.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by Administrator on 2016-8-21.
 */
@Service
public class UserService {

    @Autowired
    UserDao mUserDao;

    @Autowired
    FundService mFundService;


    /**
     * 插入用户
     * @param uid
     */
    public void insertUser(String uid){
        if(StringUtils.isEmpty(uid)){
            return;
        }
        mUserDao.insertUser(uid);
    }


    public void fullFill

}
