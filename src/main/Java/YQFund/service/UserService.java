package YQFund.service;

import YQFund.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016-8-21.
 */
@Service
public class UserService {

    @Autowired
    UserDao mUserDao;

    @Autowired
    FundService mFundService;



}
